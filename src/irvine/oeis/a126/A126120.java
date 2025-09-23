package irvine.oeis.a126;
// manually 2025-09-22

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A126120 Catalan numbers (A000108) interpolated with 0's.
 * @author Georg Fischer
 */
public class A126120 extends HolonomicRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A126120() {
    super(0, "[[0],[8,-4],[4,-4],[1,1],[2,1]]", "[1,0,1,0]", 0);
  }

  @Override
  public Z a(final Z n) {
    return n.testBit(0) ? Z.ZERO : Functions.CATALAN.z(n.shiftRight(1));
  }

  @Override
  public Z a(final int n) {
    return (n & 1) == 1 ? Z.ZERO : Functions.CATALAN.z(n >> 1);
  }
}
