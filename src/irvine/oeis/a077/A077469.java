package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077469 Greedy powers of (3/4): sum_{n=1..inf} (3/4)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A077469 extends Sequence1 {

  private static final CR THREE_QUARTERS = CR.valueOf(new Q(3, 4));
  private static final CR LOG34 = THREE_QUARTERS.log();
  private Z mSum = null;
  private CR mG = CR.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
    } else {
      mG = THREE_QUARTERS.pow(mG.frac()).subtract(THREE_QUARTERS).log().divide(LOG34);
      mSum = mSum.add(mG.floor());
    }
    return mSum;
  }
}
