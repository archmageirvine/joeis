package irvine.oeis.a387;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387426 allocated for Kenneth J Scheller.
 * @author Sean A. Irvine
 */
public class A387426 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    final HashSet<Q> seen = new HashSet<>();
    for (long k = 1; k <= n; ++ k) {
      Q t = new Q(n % k, k);
      if (t.compareTo(Q.HALF) >= 0) {
        t = t.subtract(Q.HALF);
      }
      if (!seen.add(t) && !t.isZero()) {
        return false;
      }
    }
    return true;
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
