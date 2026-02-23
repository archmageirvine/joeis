package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A393333 Nonnegative integers k such that the Chebyshev distance between the vector of proportions of the digits 0-9 in 2^k and the uniform distribution (1/10, ..., 1/10) sets a new minimum.
 * @author Sean A. Irvine
 */
public class A393333 extends Sequence1 {

  private static final Q ONE_TENTH = new Q(1, 10);
  private Q mBest = Q.ONE;
  private long mN = -1;

  private Q dist(final long n) {
    final int[] cnts = ZUtils.digitCounts(Z.ONE.shiftLeft(n));
    final long total = Functions.SUM.l(cnts);
    Q s = Q.ZERO;
    for (final int c : cnts) {
      final Q q = new Q(c, total).subtract(ONE_TENTH).abs();
      s = s.max(q);
      if (s.compareTo(mBest) >= 0) {
        return s;
      }
    }
    return s;
  }

  @Override
  public Z next() {
    while (true) {
      final Q s = dist(++mN);
      if (s.compareTo(mBest) < 0) {
        mBest = s;
        return Z.valueOf(mN);
      }
    }
  }
}
