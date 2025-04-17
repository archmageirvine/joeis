package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076796 Greedy powers of Pi/4: Sum_{n&gt;=1} (Pi/4)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A076796 extends Sequence1 {

  private static final CR PI4 = CR.PI.divide(4);
  private static final CR LOG_PI4 = PI4.log();
  private Z mSum = Z.ZERO;
  private CR mG = null;

  @Override
  public Z next() {
    if (mG == null) {
      mG = CR.ONE;
    } else {
      mG = PI4.pow(mG.frac()).subtract(PI4).log().divide(LOG_PI4);
    }
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}

