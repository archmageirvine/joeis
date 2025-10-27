package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083812 Numbers k such that 4*k-1 is the digit reversal of k-1.
 * @author Sean A. Irvine
 */
public class A083812 extends Sequence1 {

  private long mN = 8;
  private long mLim = 20;

  @Override
  public Z next() {
    while (true) {
      mN += 10;
      if (mN > mLim) {
        mLim *= 10;
        mN = mLim / 2 + 8;
      }
      if (4 * mN - 1 == Functions.REVERSE.l(mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
