package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164404 Number of binary strings of length n with no substrings equal to 0010 or 1011.
 * @author Sean A. Irvine
 */
public class A164404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164404() {
    super(4, new long[] {2, -2, 0, 2}, new long[] {14, 24, 41, 70});
  }
}
