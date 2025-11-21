package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A081979 Smallest Fibonacci number with 2n divisors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A081979 extends Sequence1 {

  private static final long LIMIT = 1000; // Controls memory use
  private long mN = 0;
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= LIMIT) {
      throw new UnsupportedOperationException();
    }
    while (mFirsts.get(mN) == null) {
      final Z f = mA.add(mB);
      mA = mB;
      mB = f;
      final long s = Functions.SIGMA0.l(f);
      if (s < 2 * LIMIT && (s & 1) == 0 && mFirsts.get(s / 2) == null) {
        mFirsts.set(s / 2, f);
      }
    }
    return mFirsts.get(mN);
  }
}
