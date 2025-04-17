package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076798 Greedy powers of (Pi/6): Sum_{n&gt;=1} (Pi/6)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A076798 extends Sequence1 {

  private static final CR PI6 = CR.PI.divide(6);
  private static final CR LOG_PI6 = PI6.log();
  private Z mSum = Z.ZERO;
  private CR mG = null;

  @Override
  public Z next() {
    if (mG == null) {
      mG = CR.ONE;
    } else {
      mG = PI6.pow(mG.frac()).subtract(PI6).log().divide(LOG_PI6);
    }
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}

