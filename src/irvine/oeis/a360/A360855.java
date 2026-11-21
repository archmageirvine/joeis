package irvine.oeis.a360;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A360855 Array read by antidiagonals: T(m,n) is the number of triangles in the rook graph K_m X K_n.
 * @author Gregory Morse
 */
public class A360855 extends AntidiagonalSequence {
  static Z triangles(final int m, final int n) {
    return Binomial.binomial(m, 3).multiply(n).add(Binomial.binomial(n, 3).multiply(m));
  }

  /** Construct the sequence. */
  public A360855() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        return triangles(m, n);
      }
    });
  }
}
