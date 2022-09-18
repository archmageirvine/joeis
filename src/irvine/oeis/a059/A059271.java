package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059271 Transform of A059226 applied to sequence 0, 1, 0, 0, 0, 0, ...
 * @author Sean A. Irvine
 */
public class A059271 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int m) {
    if (n == 1) {
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
    return get(++mN, mN);
  }
}
