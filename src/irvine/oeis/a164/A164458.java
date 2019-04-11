package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164458 Number of binary strings of length n with no substrings equal to <code>0001 0011</code> or 1011.
 * @author Sean A. Irvine
 */
public class A164458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164458() {
    super(new long[] {1, -1, -1, 0, 2}, new long[] {13, 21, 32, 47, 68});
  }
}
