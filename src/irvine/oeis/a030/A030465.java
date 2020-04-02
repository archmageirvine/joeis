package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030465 Numbers n such that n concatenated with <code>n+1</code> is a square.
 * @author Sean A. Irvine
 */
public class A030465 implements Sequence {

  // Last digit of n must be 0, 3, 4, 5, 8, or 9.

  private static final long[] STEP = {3, 1, 1, 3, 1, 1};
  private long mN = 180;
  private int mIndex = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mIndex == STEP.length) {
        mIndex = 0;
      }
      mN += STEP[mIndex];
      final Z candidate = new Z(mN + String.valueOf(mN + 1));
      if (candidate.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
