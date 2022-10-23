package irvine.oeis.a055;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055114 Numbers k such that the continued fraction for m/k contains a term &gt;= 3 for every 1 &lt;= m &lt; k.
 * @author Sean A. Irvine
 */
public class A055114 extends Sequence1 {

  private long mN = 22;

  private boolean is(Q n) {
    while (true) {
      final Z t = n.toZ();
      if (t.compareTo(Z.THREE) >= 0) {
        return true;
      }
      n = n.subtract(t);
      if (Q.ZERO.equals(n)) {
        return false;
      }
      n = n.reciprocal();
    }
  }

  private boolean is(final long n) {
    for (long k = 1; k < n; ++k) {
      if (!is(new Q(k, n))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
