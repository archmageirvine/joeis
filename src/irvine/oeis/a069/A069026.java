package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A069026 Smallest power of 4 with digit sum n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069026 extends Sequence1 {

  private Z mA = null;
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private int mN = 0;

  private void step() {
    mA = mA == null ? Z.ONE : mA.shiftLeft(2);
    final long ds = Functions.DIGIT_SUM.l(mA);
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

