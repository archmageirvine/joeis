package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031153 Numbers k such that k^2 contains only digits {1,2,5}.
 * @author Sean A. Irvine
 */
public class A031153 implements Sequence {

  private static final long[] STEP = {4, 4, 2};
  private Z mN = Z.NEG_ONE;
  private int mStepIndex = 1;

  private boolean is125(Z n) {
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final int r = qr[1].intValue();
      if (r != 1 && r != 2 && r != 5) {
        return false;
      }
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mStepIndex == STEP.length) {
        mStepIndex = 0;
      }
      mN = mN.add(STEP[mStepIndex]);
      if (is125(mN.square())) {
        return mN;
      }
    }
  }
}
