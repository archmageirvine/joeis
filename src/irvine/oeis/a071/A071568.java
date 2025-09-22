package irvine.oeis.a071;
// manually 2025-09-21

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A071568 Smallest k&gt;n such that n^3+1 divides k*n^2+1.
 * @author Georg Fischer
 */
public class A071568 extends GeneratingFunctionSequence implements DirectSequence {

  /** Construct the sequence. */
  public A071568() {
    super(0, new long[] {1, -1, 5, 1},
      new long[] {1, -4, 6, -4, 1});
  }

  @Override
  public Z a(final Z n) {
    return n.pow(3).add(n).add(1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).pow(3).add(n + 1);
  }
}
