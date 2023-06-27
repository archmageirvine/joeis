package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164458 Number of binary strings of length n with no substrings equal to 0001 0011 or 1011.
 * @author Sean A. Irvine
 */
public class A164458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164458() {
    super(4, new long[] {1, -1, -1, 0, 2}, new long[] {13, 21, 32, 47, 68});
  }
}
