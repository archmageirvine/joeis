package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079933 Greedy powers of (1/sqrt(3)): sum_{n=1..inf} (1/sqrt(3))^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A079933 extends Sequence1 {

  private final CR mX = CR.THREE.sqrt().inverse();
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
