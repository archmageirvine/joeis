package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080058 Greedy powers of (1/zeta(2)): Sum_{n&gt;=1} (1/zeta(2))^a(n) = 1, where 1/zeta(2) = 6/Pi^2 = .607927101854...
 * @author Sean A. Irvine
 */
public class A080058 extends Sequence1 {

  private final CR mX = Zeta.zeta(2).inverse();
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
