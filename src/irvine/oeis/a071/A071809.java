package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071809 Smallest s such that sk-1 is squarefree for 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A071809 extends Sequence1 {

  private Z mS = Z.TWO;
  private int mN = 0;

  private boolean is(final int n, final Z s) {
    for (long k = n; k > 0; --k) {
      if (!Predicates.SQUARE_FREE.is(s.multiply(k).subtract(1))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(mN, mS)) {
        return mS;
      }
      mS = mS.add(1);
    }
  }
}
