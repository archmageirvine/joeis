package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164422 Number of binary strings of length n with no substrings equal to 0000 0010 or 1010.
 * @author Sean A. Irvine
 */
public class A164422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164422() {
    super(4, new long[] {1, 1, 1, 0, 1}, new long[] {13, 21, 35, 60, 102});
  }
}
