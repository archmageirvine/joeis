package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031154 Numbers k such that <code>k^2</code> contains only digits <code>{2,4,5}</code>.
 * @author Sean A. Irvine
 */
public class A031154 implements Sequence {

  private static final long[] STEP = {3, 3, 4};
  private Z mN = Z.valueOf(-2);
  private int mStepIndex = 1;

  private boolean is245(Z n) {
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final int r = qr[1].intValue();
      if (r != 2 && r != 4 && r != 5) {
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
      if (is245(mN.square())) {
        return mN;
      }
    }
  }
}
