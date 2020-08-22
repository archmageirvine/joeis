package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A006278 Numbers that are a product of successive primes congruent to 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A006278 extends A000040 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(4) == 1) {
        mProd = mProd.multiply(p);
        return mProd;
      }
    }
  }
}
