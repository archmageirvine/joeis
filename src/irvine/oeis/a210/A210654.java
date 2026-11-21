package irvine.oeis.a210;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A210654 Triangle read by rows: T(n,k) (1 &lt;= k &lt;= n) = number of irreducible coverings by edges of the complete bipartite graph K_{n,k}.
 * @author Gregory Morse
 */
public class A210654 extends Triangle {
  private final MemoryFunctionInt2<Z> mCovers = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0 || m == 0) {
        return n == m ? Z.ONE : Z.ZERO;
      }
      // Each component of a minimal edge cover is a star.
      Z sum = Z.ZERO;
      for (int k = 1; k <= m; ++k) {
        sum = sum.add(Binomial.binomial(m, k).multiply(get(n - 1, m - k)));
      }
      for (int k = 1; k < n; ++k) {
        sum = sum.add(Binomial.binomial(n - 1, k).multiply(get(n - 1 - k, m - 1)).multiply(m));
      }
      return sum;
    }
  };

  /** Construct the sequence. */
  public A210654() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return mCovers.get(n + 1, k + 1);
  }
}
