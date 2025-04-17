package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076801 Greedy powers of (e/5): sum_{n=1..inf} (e/5)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A076801 extends Sequence1 {

  private static final CR E5 = CR.E.divide(5);
  private static final CR LOG_E5 = E5.log();
  private Z mSum = Z.ZERO;
  private CR mG = null;

  @Override
  public Z next() {
    if (mG == null) {
      mG = CR.ONE;
    } else {
      mG = E5.pow(mG.frac()).subtract(E5).log().divide(LOG_E5);
    }
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}

