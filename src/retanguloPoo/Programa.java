package retanguloPoo;

import java.util.Scanner;

public class Programa {
	public static void main(String Args[]) {
		Scanner input = new Scanner(System.in);

		Retangulo ret = new Retangulo();

		ret.exibe();

		System.out.print("Informe a altura do retângulo: ");
		float alt = input.nextFloat();
		ret.setAltura(alt);

		ret.exibe();

		System.out.print("Informe a largura do retângulo: ");
		ret.setLargura(input.nextFloat());

		ret.exibe();

		System.out.println("A area é: " + ret.calculaArea());
		System.out.println("O perimetro é: " + ret.calculaPerimetro());
		input.close();

	}
}