package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034905 Numbers n such that n^2 contains no loops in its digits (assumes 1, 2, 3, 5, 7 have no loops and 0, 4, 6, 8, 9 do).
 * @author Sean A. Irvine
 */
public class A034905 implements Sequence {

  private static final long[] STEP = {4, 4, 2};
  private Z mN = Z.NEG_ONE;
  private int mStepIndex = 1;

  private boolean is12357(Z n) {
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final int r = qr[1].intValue();
      if (r != 1 && r != 2 && r != 3 && r != 5 && r != 7) {
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
      if (is12357(mN.square())) {
        return mN;
      }
    }
  }
}
