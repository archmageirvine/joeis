package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079931 Greedy powers of (1/sqrt(Pi)): Sum_{n&gt;=1} (1/sqrt(Pi))^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A079931 extends Sequence1 {

  private final CR mX = CR.PI.sqrt().inverse();
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
