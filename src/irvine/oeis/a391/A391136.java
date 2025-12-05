package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a105.A105126;

/**
 * A391136 Primes p == 9 (mod 16) for which the real part of the octonic Gauss sum ("normalized", i.e., divided by sqrt(p) ) is less than 1.
 * @author Sean A. Irvine
 */
public class A391136 extends A105126 {

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
        sum = sum.add(e8);
      }
      if (sum.multiply(2).divide(CR.valueOf(p).sqrt()).compareTo(CR.ONE) < 0) {
        return p;
      }
    }
  }
}
