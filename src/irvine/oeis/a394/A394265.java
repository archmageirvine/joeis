package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A394265 Positive integers k for which the Chebyshev distance between the vector of proportions of the first k decimal digits of Pi and the uniform distribution (1/10, ..., 1/10) sets a new minimum.
 * @author Sean A. Irvine
 */
public class A394265 extends Sequence1 {

  private static final Q ONE_TENTH = new Q(1, 10);
  private final Sequence mPi = new A000796();
  private final long[] mCounts = new long[10];
  private Q mBest = Q.ONE;
  private long mN = 0;

  private Q dist(final long n) {
    Q s = Q.ZERO;
    for (final long c : mCounts) {
      final Q q = new Q(c, n).subtract(ONE_TENTH);
      s = s.max(q.abs());
      if (s.compareTo(mBest) >= 0) {
        return s;
      }
    }
    return s;
  }

  @Override
  public Z next() {
    while (true) {
      ++mCounts[mPi.next().intValue()];
      final Q s = dist(++mN);
      if (s.compareTo(mBest) < 0) {
        mBest = s;
        return Z.valueOf(mN);
      }
    }
  }
}
