package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076797 Greedy powers of (Pi/5): Sum_{n&gt;=1} (Pi/5)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A076797 extends Sequence1 {

  private static final CR PI5 = CR.PI.divide(5);
  private static final CR LOG_PI5 = PI5.log();
  private Z mSum = Z.ZERO;
  private CR mG = null;

  @Override
  public Z next() {
    if (mG == null) {
      mG = CR.ONE;
    } else {
      mG = PI5.pow(mG.frac()).subtract(PI5).log().divide(LOG_PI5);
    }
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}

