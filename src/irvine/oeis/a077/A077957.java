package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A077957 Powers of 2 alternating with zeros.
 * @author Sean A. Irvine
 */
public class A077957 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A077957() {
    super(new long[] {2, 0}, new long[] {1, 0});
  }

  @Override
  public Z a(final Z n) {
    return !n.testBit(0) ? Z.TWO.pow(n.divide2()) : Z.ZERO;
  }

  @Override
  public Z a(final long n) {
    return ((n & 1) == 0) ? Z.TWO.pow(n / 2) : Z.ZERO;
  }

}
