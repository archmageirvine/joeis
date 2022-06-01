package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164434 Number of binary strings of length n with no substrings equal to 0000 0101 or 1010.
 * @author Sean A. Irvine
 */
public class A164434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164434() {
    super(new long[] {-1, -1, 0, 1, 2, 0, 1}, new long[] {13, 23, 40, 70, 122, 213, 372});
  }
}
