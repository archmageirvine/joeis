package irvine.oeis.a328;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a072.A072590;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A328888 Array read by antidiagonals: T(n,m) is the number of acyclic edge covers of the complete bipartite graph K_{n,m}.
 * @author Gregory Morse
 */
public class A328888 extends AntidiagonalSequence {
  protected A328888(final boolean isolates) {
    super(isolates ? 0 : 1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (n == 0 || m == 0) {
          return isolates || n + m == 0 ? Z.ONE : Z.ZERO;
        }
        Z sum = isolates ? get(n - 1, m) : Z.ZERO;
        // Choose the component of the first vertex of the first color.
        for (int i = 1; i <= n; ++i) {
          for (int j = 1; j <= m; ++j) {
            final Z labels = Binomial.binomial(n - 1, i - 1).multiply(Binomial.binomial(m, j));
            sum = sum.add(labels.multiply(A072590.spanningTrees(i, j)).multiply(get(n - i, m - j)));
          }
        }
        return sum;
      }
    });
  }

  /** Construct the sequence. */
  public A328888() {
    this(false);
  }
}
