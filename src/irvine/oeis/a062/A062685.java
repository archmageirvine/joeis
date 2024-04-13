package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;
import irvine.util.array.LongDynamicArray;

/**
 * A062685 Smallest square with digit sum n (or 0 if no such square exists).
 * @author Sean A. Irvine
 */
public class A062685 extends A000290 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final long r = ++mN % 9;
    if (r == 2 || r == 3 || r == 5 || r == 6 || r == 8) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == null) {
      final Z sq = super.next();
      final long d = Functions.DIGIT_SUM.l(sq);
      if (mFirsts.get(d) == null) {
        mFirsts.set(d, sq);
      }
    }
    return mFirsts.get(mN);
  }
}
