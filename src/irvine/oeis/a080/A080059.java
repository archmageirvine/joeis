package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080059 Greedy powers of (1/zeta(3)): sum_{n=1..inf} (1/zeta(3))^a(n) = 1, where 1/zeta(3) = .83190737258070746868...
 * @author Sean A. Irvine
 */
public class A080059 extends Sequence1 {

  private final CR mX = Zeta.zeta(3).inverse();
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
