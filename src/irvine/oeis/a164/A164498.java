package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164498 Number of binary strings of length n with no substrings equal to 0010 0110 or 1100.
 * @author Sean A. Irvine
 */
public class A164498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164498() {
    super(new long[] {1, 0, -1, 2, -2, 0, 2}, new long[] {13, 21, 33, 53, 84, 135, 217});
  }
}
