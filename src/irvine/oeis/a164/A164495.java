package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164495 Number of binary strings of length n with no substrings equal to 0010 0101 or 1011.
 * @author Sean A. Irvine
 */
public class A164495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164495() {
    super(4, new long[] {1, 0, 1, 0, -1, 2}, new long[] {13, 22, 37, 62, 105, 178});
  }
}
