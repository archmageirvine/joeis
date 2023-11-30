package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A082010 a(n) = n/2 if n is even, otherwise floor(8*n/5)+1.
 * @author Sean A. Irvine
 */
public class A082010 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A082010() {
    super(new long[]{-1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0}, new long[]{0, 2, 1, 5, 2, 9, 3, 12, 4, 15, 5, 18});
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return !n.testBit(0) ? n.divide2() : n.shiftLeft(3).divide(5).add(1);
  }
}
