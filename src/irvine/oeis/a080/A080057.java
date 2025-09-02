package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080057 Greedy powers of (e^-Gamma): sum_{n=1..inf} (e^-Gamma)^a(n) = 1, where e^-Gamma = e^(-.57721566490153286...) = .561459483566885169...
 * @author Sean A. Irvine
 */
public class A080057 extends Sequence1 {

  private final CR mX = CR.GAMMA.negate().exp();
  private final CR mLogX = mX.log();
  private CR mG = null;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mG = mG == null ? CR.ONE : mX.pow(mG.frac()).subtract(mX).log().divide(mLogX);
    mSum = mSum.add(mG.floor());
    return mSum;
  }
}
