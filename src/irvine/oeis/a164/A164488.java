package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164488 Number of binary strings of length n with no substrings equal to 0001 1010 or 1101.
 * @author Sean A. Irvine
 */
public class A164488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164488() {
    super(new long[] {-1, 1, 0, -1, 1, -1, 2}, new long[] {13, 21, 33, 52, 81, 126, 195});
  }
}
