package irvine.oeis.a360;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A360850 Array read by antidiagonals: T(m,n) is the number of (undirected) paths in the complete bipartite graph K_{m,n}.
 * @author Gregory Morse
 */
public class A360850 extends AntidiagonalSequence {
  /** Construct the sequence. */
  public A360850() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        Z sum = Z.ZERO;
        for (int k = 1; k <= Math.min(m, n); ++k) {
          sum = sum.add(Binomial.binomial(m, k).multiply(Binomial.binomial(n, k)).multiply(Functions.FACTORIAL.z(k).square()).multiply(m + n + 2L - 2L * k));
        }
        return sum.divide2();
      }
    });
  }
}
