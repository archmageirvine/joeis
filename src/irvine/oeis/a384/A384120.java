package irvine.oeis.a384;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A384120 Array read by antidiagonals: T(n,m) is the number of cliques in the n X m rook graph K_n X K_m.
 * @author Gregory Morse
 */
public class A384120 extends AntidiagonalSequence {
  /** Construct the sequence. */
  public A384120() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int m, final int n) {
        return Z.ONE.add(Z.ONE.shiftLeft(m).subtract(1).multiply(n)).add(Z.ONE.shiftLeft(n).subtract(1).multiply(m)).subtract((long) m * n);
      }
    });
  }
}
