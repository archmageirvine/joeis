package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000925 Number of ordered ways of writing n as a sum of 2 squares of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A000925 extends Sequence0 {

  private long mN = -1;

  private boolean isSquare(final long n) {
    final long r = LongUtils.sqrt(n);
    return r * r == n;
  }

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    final long s = LongUtils.sqrt(mN);
    for (long k = 0; k <= s; ++k) {
      if (isSquare(mN - k * k)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
