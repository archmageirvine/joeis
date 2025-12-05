package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a094.A094407;

/**
 * A390758 Primes == 1 (mod 16), for which the octonic Gauss sum is greater than the quartic one.
 * @author Sean A. Irvine
 */
public class A390758 extends A094407 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long pp = p.longValueExact();
      CR sum = CR.ZERO;
      final long h = (pp - 1) / 2;
      for (long k = 1; k <= h; ++k) {
        final CR tp = CR.TAU.divide(pp);
        final CR e8 = tp.multiply(Z.valueOf(k).pow(8)).cos();
        final CR e4 = tp.multiply(Z.valueOf(k).pow(4)).cos();
        sum = sum.add(e8.subtract(e4));
      }
      if (sum.signum() > 0) {
        return p;
      }
    }
  }
}
