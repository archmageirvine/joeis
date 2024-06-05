package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A061443 Numbers k such that the Lucas Aurifeuillian primitive part B of Lucas(k) is prime.
 * @author Sean A. Irvine
 */
public class A061443 extends A061447 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 5;
      final Z lucasStar = lucasStar(mN);
      final Z f = Functions.FIBONACCI.z(mN / 5);
      final Z a = f.multiply(f.add(1)).multiply(5).add(1);
      final Z g = lucasStar.gcd(a);
      if (g.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
