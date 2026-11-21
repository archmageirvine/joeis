package irvine.oeis.a384;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a287.A287274;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A384116 Array read by antidiagonals: T(n,m) is the number of total dominating sets in the n X m rook graph K_n X K_m.
 * @author Gregory Morse
 */
public class A384116 extends AntidiagonalSequence {
  protected static Z total(final int m, final int n) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= Math.min(m, n); ++k) {
      // An isolated occupied square excludes its row and column from the other squares.
      final Z matchings = Binomial.binomial(m, k).multiply(Binomial.binomial(n, k)).multiply(Functions.FACTORIAL.z(k));
      sum = sum.signedAdd((k & 1) == 0, matchings.multiply(A287274.dominating(m - k, n - k)));
    }
    return sum;
  }

  /** Construct the sequence. */
  public A384116() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        return total(m, n);
      }
    });
  }
}
