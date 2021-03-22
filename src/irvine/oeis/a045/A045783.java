package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001055;
import irvine.oeis.a025.A025487;
import irvine.util.array.LongDynamicLongArray;

/**
 * A045783 Least value with A045782(n) factorizations.
 * @author Sean A. Irvine
 */
public class A045783 extends A001055 {

  private final Sequence mA = new A025487();
  private final LongDynamicLongArray mLeast = new LongDynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (mLeast.get(mN) == 0) {
      final long n = mA.next().longValueExact();
      final long t = t(n, n);
      if (mLeast.get(t) == 0) {
        mLeast.set(t, n);
      }
    }
    return Z.valueOf(mLeast.get(mN));
  }
}
