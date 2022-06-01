package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164477 Number of binary strings of length n with no substrings equal to 0001 0110 or 1000.
 * @author Sean A. Irvine
 */
public class A164477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164477() {
    super(new long[] {-1, 1, 0, -1, 0, 2}, new long[] {13, 21, 35, 59, 100, 170});
  }
}
