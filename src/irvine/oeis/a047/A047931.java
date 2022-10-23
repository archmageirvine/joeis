package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047931 Number of new penny-penny contacts when putting pennies on a table following a spiral pattern.
 * @author Sean A. Irvine
 */
public class A047931 extends Sequence1 {

  private static final int[] SMALL = {0, 1, 2, 2, 2, 2, 3};
  private int mN = 1;
  private int mM = -1;

  @Override
  public Z next() {
    if (mN <= 1) {
      if (++mM < SMALL.length) {
        return Z.valueOf(SMALL[mM]);
      }
    }
    if (++mM >= 6 * mN) {
      ++mN;
      mM = 0;
    }
    return mM == 0 || mM == mN - 1 || mM == 2 * mN - 1 || mM == 3 * mN - 1 || mM == 4 * mN - 1 || mM == 5 * mN - 1 ? Z.TWO : Z.THREE;
  }
}
