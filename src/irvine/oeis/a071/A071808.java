package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071779.
 * @author Sean A. Irvine
 */
public class A071808 extends Sequence1 {

  private Z mS = Z.ONE;
  private int mN = 0;

  private boolean is(final int n, final Z s) {
    for (long k = n; k > 0; --k) {
      if (!Predicates.SQUARE_FREE.is(s.multiply(k).add(1))) {
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
