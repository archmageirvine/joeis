package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076800 Greedy powers of (e/4): sum_{n=1..inf} (e/4)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A076800 extends Sequence1 {

  private static final CR E4 = CR.E.divide(4);
  private static final CR LOG_E4 = E4.log();
  private Z mSum = Z.ZERO;
  private CR mG = null;

  @Override
  public Z next() {
    if (mG == null) {
      mG = CR.ONE;
    } else {
      mG = E4.pow(mG.frac()).subtract(E4).log().divide(LOG_E4);
    }
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}

