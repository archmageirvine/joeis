package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076802 Greedy powers of the gamma constant (0.577215664...) Sum_{n=1..infinity} (gamma)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A076802 extends Sequence1 {

  private static final CR LOG_GAMMA = CR.GAMMA.log();
  private Z mSum = Z.ZERO;
  private CR mG = null;

  @Override
  public Z next() {
    if (mG == null) {
      mG = CR.ONE;
    } else {
      mG = CR.GAMMA.pow(mG.frac()).subtract(CR.GAMMA).log().divide(LOG_GAMMA);
    }
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}

