package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218132 Number of length 9 primitive (=aperiodic or period <code>9)</code> n-ary words.
 * @author Sean A. Irvine
 */
public class A218132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218132() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 0, 504, 19656, 262080, 1953000, 10077480, 40353264, 134217216, 387419760});
  }
}
