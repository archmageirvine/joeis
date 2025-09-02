package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080056 Greedy powers of (2/Pi): sum_{n=1..inf} (2/Pi)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A080056 extends Sequence1 {

  private final CR mX = CR.TWO.divide(CR.PI);
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
