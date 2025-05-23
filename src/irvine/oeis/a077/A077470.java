package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077470 Greedy powers of (3/5): sum_{n=1..inf} (3/5)^a(n) = 1.
 * @author Sean A. Irvine
 */
public class A077470 extends Sequence1 {

  private static final CR THREE_FIFTHS = CR.valueOf(new Q(3, 5));
  private static final CR LOG35 = THREE_FIFTHS.log();
  private Z mSum = null;
  private CR mG = CR.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
    } else {
      mG = THREE_FIFTHS.pow(mG.frac()).subtract(THREE_FIFTHS).log().divide(LOG35);
      mSum = mSum.add(mG.floor());
    }
    return mSum;
  }
}
