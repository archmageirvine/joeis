package irvine.oeis.a390;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390319 Numbers k with exactly five coincident values among the fractions (2*k mod m)/m for 1 &lt;= m &lt;= k.
 * @author Sean A. Irvine
 */
public class A390319 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final long m = 2 * n;
    final HashSet<Q> seen = new HashSet<>();
    final HashSet<Q> dup = new HashSet<>();
    for (long k = 1; k <= n; ++ k) {
      final Q t = new Q(m % k, k);
      if (!seen.add(t)) {
        dup.add(t);
        if (dup.size() > 5) {
          return false;
        }
      }
    }
    return dup.size() == 5;
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
