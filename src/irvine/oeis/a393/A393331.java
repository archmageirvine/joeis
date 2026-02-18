package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A393331 allocated for Pontus von Br\u00f6mssen.
 * @author Sean A. Irvine
 */
public class A393331 extends Sequence1 {

  private static final Q ONE_TENTH = new Q(1, 10);
  private Q mBest = Q.ONE;
  private long mN = -1;

  private Q dist(final long n) {
    final int[] cnts = ZUtils.digitCounts(Z.ONE.shiftLeft(n));
    final long total = Functions.SUM.l(cnts);
    Q s = Q.ZERO;
    for (final int c : cnts) {
      final Q q = new Q(c, total).subtract(ONE_TENTH);
      s = s.add(q.square());
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
