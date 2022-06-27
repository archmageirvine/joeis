package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicArray;

/**
 * A057775 a(n) is the least prime p such that p-1 is divisible by 2^n and not by 2^(n+1).
 * @author Sean A. Irvine
 */
public class A057775 extends A000040 {

  private final LongDynamicArray<Z> mLeast = new LongDynamicArray<>();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mLeast.get(mN) == null) {
      final Z p = super.next();
      final long zeros = p.subtract(1).makeOdd().auxiliary();
      if (mLeast.get(zeros) == null) {
        mLeast.set(zeros, p);
      }
    }
    return mLeast.get(mN);
  }
}
