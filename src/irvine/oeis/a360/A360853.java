package irvine.oeis.a360;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A360853 Array read by antidiagonals: T(m,n) is the number of induced cycles in the rook graph K_m X K_n.
 * @author Gregory Morse
 */
public class A360853 extends AntidiagonalSequence {
  /** Construct the sequence. */
  public A360853() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        return A360849.cycles(m, n).add(A360855.triangles(m, n));
      }
    });
  }
}
