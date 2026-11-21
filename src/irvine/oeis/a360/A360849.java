package irvine.oeis.a360;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A360849 Array read by antidiagonals: T(m,n) is the number of (undirected) cycles in the complete bipartite graph K_{m,n}.
 * @author Gregory Morse
 */
public class A360849 extends AntidiagonalSequence {
  static Z cycles(final int m, final int n) {
    Z sum = Z.ZERO;
    for (int k = 2; k <= Math.min(m, n); ++k) {
      sum = sum.add(Binomial.binomial(m, k).multiply(Binomial.binomial(n, k)).multiply(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(k - 1)));
    }
    return sum.divide2();
  }

  /** Construct the sequence. */
  public A360849() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        return cycles(m, n);
      }
    });
  }
}
