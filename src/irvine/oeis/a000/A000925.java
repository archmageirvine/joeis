package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000925.
 * @author Sean A. Irvine
 */
public class A000925 implements Sequence {

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
