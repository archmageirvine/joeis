package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077459.
 * @author Sean A. Irvine
 */
public class A077474 extends Sequence1 {

  private static final CR C = CR.valueOf(new Q(7, 10));
  private static final CR LOG = C.log();
  private Z mSum = null;
  private CR mG = CR.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
    } else {
      mG = C.pow(mG.frac()).subtract(C).log().divide(LOG);
      mSum = mSum.add(mG.floor());
    }
    return mSum;
  }
}
