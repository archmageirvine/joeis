package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030466 Squares that are concatenations of two consecutive nonzero numbers.
 * @author Sean A. Irvine
 */
public class A030466 extends Sequence1 {

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
        return candidate;
      }
    }
  }
}
