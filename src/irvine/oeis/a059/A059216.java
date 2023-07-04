package irvine.oeis.a059;

import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.math.z.Z;

/**
 * A059216 Variation of Boustrophedon transform applied to all-1's sequence (see Comments for details).
 * @author Sean A. Irvine
 */
public class A059216 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    if ((n & 1) == 0) {
      if (m == n) {
        return Z.ONE;
      }
      Z sum = get(n, m + 1);
      for (int row = n - 1; row >= m; --row) {
        sum = sum.add(get(row, m));
      }
      return sum;
    } else {
      if (m == 0) {
        return Z.ONE;
      }
      Z sum = get(n, m - 1);
      for (int row = n - 1; row >= 0 && m >= n - row; --row) {
        sum = sum.add(get(row, m - (n - row)));
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
