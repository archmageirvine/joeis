package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077472 Greedy powers of (5/8): Sum_{n&gt;=1} (5/8)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A077472 extends Sequence1 {

  private static final CR C = CR.valueOf(new Q(5, 8));
  private static final CR LOG58 = C.log();
  private Z mSum = null;
  private CR mG = CR.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
    } else {
      mG = C.pow(mG.frac()).subtract(C).log().divide(LOG58);
      mSum = mSum.add(mG.floor());
    }
    return mSum;
  }
}
