package irvine.oeis.a387;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079941.
 * @author Sean A. Irvine
 */
public class A387740 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (n < 0 || m == 0) {
        return Z.ZERO;
      }
      final int r = m % 5;
      return r == 2 || r == 3 ? get(n, m - 1).add(get(n - m, m)) : get(n, m - 1);
    }
  };

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (int k = (++mN + 1) / 2; k <= mN; ++k) {
      final int r = k % 5;
      if (r == 2 || r == 3) {
        sum = sum.add(mB.get(mN - k, k));
      }
    }
    return sum;
  }
}

