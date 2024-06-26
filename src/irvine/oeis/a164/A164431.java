package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164431 Number of binary strings of length n with no substrings equal to 0000, 0011 or 1101.
 * @author Sean A. Irvine
 */
public class A164431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164431() {
    super(0, new long[] {1, 0, -1, 1, -1, 2}, new long[] {1, 2, 4, 8, 13, 21});
  }
}
