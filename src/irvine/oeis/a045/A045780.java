package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a025.A025487;
import irvine.util.array.DynamicLongArray;

/**
 * A045780 Least value with A045779(n) factorizations into distinct factors.
 * @author Sean A. Irvine
 */
public class A045780 extends A045778 {

  private final Sequence mA = new A025487();
  private final DynamicLongArray mLeast = new DynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (mLeast.get(mN) == 0) {
      final long n = mA.next().longValueExact();
      final int t = get(n, n).intValueExact();
      if (mLeast.get(t) == 0) {
        mLeast.set(t, n);
      }
    }
    return Z.valueOf(mLeast.get(mN));
  }
}
