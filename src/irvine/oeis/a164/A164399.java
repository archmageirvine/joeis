package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164399 Number of binary strings of length n with no substrings equal to 0001 or 1010.
 * @author Sean A. Irvine
 */
public class A164399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164399() {
    super(4, new long[] {-2, 2, -1, 2}, new long[] {14, 24, 41, 70});
  }
}
