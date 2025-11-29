package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a007.A007519;

/**
 * A387776 Primes p = 1 (mod 8) for which the quartic Gauss sum is larger than the quadratic Gauss sum.
 * @author Sean A. Irvine
 */
public class A387776 extends A007519 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long pp = p.longValueExact();
      CR sum = CR.ZERO;
      final long h = (pp - 1) / 2;
      for (long k = 1; k <= h; ++k) {
        final CR tp = CR.TAU.divide(pp);
        final CR e4 = tp.multiply(Z.valueOf(k).pow(4)).cos();
        final CR e2 = tp.multiply(Z.valueOf(k).square()).cos();
        sum = sum.add(e4.subtract(e2));
      }
      if (sum.signum() > 0) {
        return p;
      }
    }
  }
}
