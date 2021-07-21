package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A033150 Decimal expansion of Niven's constant.
 * @author Sean A. Irvine
 */
public class A033150 extends DecimalExpansionSequence {

  private CR mA = null;
  private int mPrevAccuracy = 0;

  @Override
  protected void ensureAccuracy(final int n) {
    if (n > mPrevAccuracy) {
      mPrevAccuracy = n;
      mA = CR.ONE;
      for (int k = 2; k <= 2 * n; ++k) { // Heuristic number of terms!
        mA = mA.add(CR.ONE.subtract(Zeta.zeta(k).inverse()));
      }
    }
  }

  @Override
  protected CR getCR() {
    return mA;
  }
}
