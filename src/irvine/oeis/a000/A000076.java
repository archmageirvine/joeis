package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000076 Number of integers &lt;= 2^n of form 4 x^2 + 4 x y + 5 y^2.
 * @author Sean A. Irvine
 */
public class A000076 extends Sequence0 {

  private int mN = -1;
  private long mPrev = 0;

  private boolean check(final long k) {
    final long jlim = LongUtils.sqrt(k) / 2;
    for (long j = 0; j <= jlim; ++j) {
      if (((k - j) & 1) == 0) {
        final long t = k - 4 * j * j;
        final long u = LongUtils.sqrt(t);
        if (u * u == t) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    final long lim = 1L << mN;
    for (long k = 1 + (lim >>> 1); k <= lim; ++k) {
      if (check(k)) {
        ++mPrev;
      }
    }
    return Z.valueOf(mPrev);
  }
}

