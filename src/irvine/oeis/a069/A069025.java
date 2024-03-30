package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A069025 Smallest power of 2 with digital sum (A007953) n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069025 extends Sequence1 {

  private Z mA = null;
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private int mN = 0;

  private void step() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    final long ds = ZUtils.digitSum(mA);
    if (mFirsts.get(ds) == null) {
      if (ds < mN) {
        throw new RuntimeException("Heuristic failed: " + ds + " previously reported as 0 should be " + mA);
      }
      mFirsts.set(ds, mA);
    }
  }

  @Override
  public Z next() {
    step();
    step();
    final Z r = mFirsts.get(++mN);
    return r == null ? Z.ZERO : r;
  }
}

