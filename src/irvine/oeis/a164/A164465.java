package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164465 Number of binary strings of length n with no substrings equal to <code>0001 0100</code> or 1010.
 * @author Sean A. Irvine
 */
public class A164465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164465() {
    super(new long[] {-1, 1, -1, 0, 1, -1, 2}, new long[] {13, 21, 35, 59, 99, 165, 274});
  }
}
