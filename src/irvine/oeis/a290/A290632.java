package irvine.oeis.a290;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A290632 Array read by antidiagonals: T(m,n) = number of minimal dominating sets in the rook graph K_m X K_n.
 * @author Gregory Morse
 */
public class A290632 extends AntidiagonalSequence {
  /** Construct the sequence. */
  public A290632() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        final int k = Math.min(m, n);
        return Z.valueOf(m).pow(n).add(Z.valueOf(n).pow(m)).subtract(Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(Math.max(m, n), k)));
      }
    });
  }
}
