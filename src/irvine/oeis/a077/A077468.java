package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077468 Greedy powers of (2/3): sum_{n=1..inf} (2/3)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A077468 extends Sequence1 {

  private static final CR TWO_THIRDS = CR.valueOf(new Q(2, 3));
  private static final CR LOG23 = TWO_THIRDS.log();
  private Z mSum = null;
  private CR mG = CR.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
    } else {
      mG = TWO_THIRDS.pow(mG.frac()).subtract(TWO_THIRDS).log().divide(LOG23);
      mSum = mSum.add(mG.floor());
    }
    return mSum;
  }
}
