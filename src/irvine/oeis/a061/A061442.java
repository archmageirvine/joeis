package irvine.oeis.a061;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;

/**
 * A061301.
 * @author Sean A. Irvine
 */
public class A061442 extends A061447 {

  private int mN = 20;

  @Override
  public Z next() {
    while (true) {
      mN += 5;
      final Z lucasStar = lucasStar(mN);
      final Z f = Fibonacci.fibonacci(mN / 5);
      final Z a = f.multiply(f.subtract(1)).multiply(5).add(1);
      final Z g = lucasStar.gcd(a);
      if (g.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
