package irvine.oeis.a004;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004251 Number of graphical partitions (degree-vectors for simple graphs with n vertices, or possible ordered row-sum vectors for a symmetric 0-1 matrix with diagonal values 0).
 * @author Sean A. Irvine
 */
public class A004251 extends Sequence0 {

  // Based on the Kai Wang paper

  private int mN = -1;
  private Z mA = Z.ONE;
  protected final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int k, final int l, final int s) {
      if (n < 0 || k < 0 || l < 0 || s < 0) {
        return Z.ZERO;
      } else if (n == 0) {
        return Z.ONE;
      } else if (k == 0 || l == 0) {
        return Z.ZERO;
      } else if (k > n) {
        return get(n, n, l, s);
      } else if (l > n) {
        return get(n, k, n, s);
      } else if (s > n) {
        return get(n, k, l, n);
      } else {
        return get(n, k - 1, l, s)
          .add(get(n, k, l - 1, s))
          .subtract(get(n, k - 1, l - 1, s))
          .add(get(n - k - l + 1, k - 1, l - 1, s + l - k - 1));
      }
    }
  };

  protected Z d(final int n) {
    Z sum = Z.ZERO;
    final int bigN = n * (n - 1);
    for (int i = (n + 1) & ~1; i <= bigN; i += 2) {
      for (int j = 1; j <= Math.min(n - 1, i - n + 1); ++j) {
        sum = sum.add(mB.get(i - j - n + 1, j - 1, n - 1, n - j - 1));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.add(d(mN));
    }
    return mA;
  }

}
