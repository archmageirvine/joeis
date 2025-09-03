package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080055 Greedy powers of log(2): Sum_{n&gt;=1} (log(2))^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A080055 extends Sequence1 {

  private final CR mX = CR.LOG2;
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
