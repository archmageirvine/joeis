package irvine.oeis.a142;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A142150 The nonnegative integers interleaved with 0's.
 * @author Sean A. Irvine
 */
public class A142150 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A142150() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 0, 1, 0});
  }

  @Override
  public Z a(final Z n) {
    return n.testBit(0) ? n.divide2() : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf((n & 1) == 0 ? n / 2 : 0);
  }

}
