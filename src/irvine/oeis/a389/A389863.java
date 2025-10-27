package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389863 Numbers k with exactly two distinct repeated values among the fractions (2*k mod m)/m for 1 &lt;= m &lt;= k.
 * @author Sean A. Irvine
 */
public class A389863 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final long m = 2 * n;
    final HashSet<Q> seen = new HashSet<>();
    long cnt = 0;
    for (long k = 1; k <= n; ++ k) {
      final Q t = new Q(m % k, k);
      if (!seen.add(t) && !t.isZero() && ++cnt > 1) {
        return false;
      }
    }
    return cnt == 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
