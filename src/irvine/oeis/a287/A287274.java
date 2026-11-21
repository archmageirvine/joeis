package irvine.oeis.a287;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.a183.A183109;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A287274 Array read by antidiagonals: T(m,n) = number of dominating sets in the lattice (rook) graph K_m X K_n.
 * @author Gregory Morse
 */
public class A287274 extends AntidiagonalSequence {
  /**
   * Count dominating sets of the rectangular rook graph.
   * @param m number of rows
   * @param n number of columns
   * @return the count
   */
  public static Z dominating(final int m, final int n) {
    // A dominating set meets every row or every column.
    return Z.ONE.shiftLeft(n).subtract(1).pow(m).add(Z.ONE.shiftLeft(m).subtract(1).pow(n)).subtract(A183109.matrices(m, n));
  }

  /** Construct the sequence. */
  public A287274() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        return dominating(m, n);
      }
    });
  }
}
