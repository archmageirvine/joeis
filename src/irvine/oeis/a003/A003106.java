package irvine.oeis.a003;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003106 Number of partitions of n into parts 5k+2 or 5k+3.
 * @author Sean A. Irvine
 */
public class A003106 extends Sequence0 {

  private int mN = -1;
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
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final int r = k % 5;
      if (r == 2 || r == 3) {
        sum = sum.add(mB.get(mN - k, k));
      }
    }
    return sum;
  }
}
