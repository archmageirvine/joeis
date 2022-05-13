package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A056888.
 * @author Sean A. Irvine
 */
public class A056888 implements Sequence {

  private static final int HEURISTIC_STEPS = 5;
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private Z mA = Z.ONE;
  private int mN = 0;

  private void step() {
    mA = mA.multiply(9);
    final long sum = ZUtils.digitSum(mA) / 9;
    mCounts.set(sum, mCounts.get(sum) + 1);
    if (sum <= mN) {
      throw new RuntimeException("Heuristic failed: " + sum + " observed while working on " + mN);
    }
  }

  @Override
  public Z next() {
    for (int k = 0; k < HEURISTIC_STEPS; ++k) {
      step();
    }
    return Z.valueOf(mCounts.get(++mN));
  }
}
