package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290477 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1,4,1,5 (the</code> first five digits of <code>Pi)</code>.
 * @author Sean A. Irvine
 */
public class A290477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290477() {
    super(new long[] {-6, 1, 0, 0, 0, 6}, new long[] {3, 19, 118, 709, 4259, 25557});
  }
}
