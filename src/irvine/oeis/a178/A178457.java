package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178457 Partial sums of <code>floor(2^n/23)</code>.
 * @author Sean A. Irvine
 */
public class A178457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178457() {
    super(new long[] {2, -3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 3}, new long[] {0, 0, 0, 0, 0, 1, 3, 8, 19, 41, 85, 174, 352});
  }
}
