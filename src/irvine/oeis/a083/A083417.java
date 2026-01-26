package irvine.oeis.a083;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083417 Primitive recursive function r(z, r(s, r(s, r(s, p_2)))) at (n, 0).
 * @author Sean A. Irvine
 */
public class A083417 extends Sequence0 {

  // After Charles R Greathouse IV

  private long mN = -1;

  private long f(final long x, final long y) {
    final long ceil = (x + 2 + y + 1) / (y + 2);
    return ((y + 2) << LongUtils.ceilLog2(ceil)) - 2 - x;
  }

  @Override
  public Z next() {
    ++mN;
    long t = 0;
    for (long k = 1; k <= mN; ++k) {
      long y = k;
      for (long i = 1; i <= t; ++i) {
        y = f(y, i);
      }
      t = y;
    }
    return Z.valueOf(t);
  }
}
