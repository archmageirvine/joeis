package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077459.
 * @author Sean A. Irvine
 */
public class A077471 extends Sequence1 {

  private static final CR C = CR.valueOf(new Q(4, 7));
  private static final CR LOG47 = C.log();
  private Z mSum = null;
  private CR mG = CR.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
    } else {
      mG = C.pow(mG.frac()).subtract(C).log().divide(LOG47);
      mSum = mSum.add(mG.floor());
    }
    return mSum;
  }
}
