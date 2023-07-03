package irvine.oeis.a029;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029894 Number of directed (or Gale-Ryser) graphical partitions: degree-vector pairs (in-degree, out-degree) for directed graphs (loops allowed) with n vertices; or possible ordered pair (row-sum, column-sum) vectors for a 0-1 matrix.
 * @author Sean A. Irvine
 */
public class A029894 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int b, final int c, final int t, final int w) {
      if (w == 0) {
        return t == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int k = 0; k <= b; ++k) {
        for (int j = (t + k + w - 1) / w; j <= Math.min(t + k, c); ++j) {
          sum = sum.add(get(k, j, t + k - j, w - 1));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN, 0, mN);
  }
}
