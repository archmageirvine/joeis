package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059226 Triangle T(n,k) (0 &lt;= k &lt;= n) read by rows: top entry is 1, all other rows begin with 0; typical entry is sum of entry to left plus sum of all entries above it in the triangle.
 * @author Sean A. Irvine
 */
public class A059226 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m == 0) {
      return Z.ZERO;
    }
    Z sum = get(n, m - 1);
    for (int row = 0; row <= n - m; ++row) {
      for (int col = 0; col <= m; ++col) {
        if (row + col != n) {
          sum = sum.add(get(row + col, col));
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
