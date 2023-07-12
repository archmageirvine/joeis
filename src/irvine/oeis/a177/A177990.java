package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A177990 Triangle read by rows, variant of A070909, a cellular automaton.
 * @author Georg Fischer
 */
public class A177990 extends Triangle {

  /** Construct the sequence. */
  public A177990() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == k ? Z.ONE : ((k & 1) == 0) ? Z.ZERO : Z.ONE;
  }
}
