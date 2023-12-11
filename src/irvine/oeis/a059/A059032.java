package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059032 Another variant of Boustrophedon transform applied to 1, 0, 0, 0, ...
 * @author Sean A. Irvine
 */
public class A059032 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    if ((n & 1) == 0) {
      if (m == n) {
        return Z.ZERO;
      }
      Z sum = get(n, m + 1);
      for (int row = n - 1; row >= 0; --row) {
        for (int col = Math.max(0, m - (n - row)); col <= Math.min(m, row); ++col) {
          sum = sum.add(get(row, col));
        }
      }
      return sum;
    } else {
      if (m == 0) {
        return Z.ZERO;
      }
      Z sum = get(n, m - 1);
      for (int row = n - 1; row >= 0; --row) {
        for (int col = Math.max(0, m - (n - row)); col <= Math.min(m, row); ++col) {
          sum = sum.add(get(row, col));
        }
      }
      return sum;
    }
  }

  @Override
  public Z next() {
    ++mN;
    return (mN & 1) == 0 ? get(mN, 0) : get(mN, mN);
  }
}
