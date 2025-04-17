package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076799 Greedy powers of (e/3): Sum_{n&gt;=1} (e/3)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A076799 extends Sequence1 {

  private static final CR E3 = CR.E.divide(3);
  private static final CR LOG_E3 = E3.log();
  private Z mSum = Z.ZERO;
  private CR mG = null;

  @Override
  public Z next() {
    if (mG == null) {
      mG = CR.ONE;
    } else {
      mG = E3.pow(mG.frac()).subtract(E3).log().divide(LOG_E3);
    }
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}

