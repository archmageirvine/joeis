package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;

/**
 * A083404 Illustration of Viswanath's constant A078416.
 * @author Sean A. Irvine
 */
public class A083404 extends Sequence0 {

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private final LongDynamicArray<Z> mB = new LongDynamicArray<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(1, Z.ONE);
      mB.set(1, Z.ONE);
      return Z.ONE;
    }
    final long m = 1L << (mN - 1);
    Z sum = Z.ZERO;
    for (long k = 1; k <= m; k++) {
      final long l = k + m;
      final Z add = mA.get(k).add(mB.get(k));
      final Z sub = mA.get(k).subtract(mB.get(k));
      mA.set(k, mB.get(k));
      mA.set(l, mB.get(k));
      mB.set(k, add);
      mB.set(l, sub);
      sum = sum.add(add.abs()).add(sub.abs());
    }
    return sum;
  }
}
