package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164489 Number of binary strings of length n with no substrings equal to 0001 1011 or 1100.
 * @author Sean A. Irvine
 */
public class A164489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164489() {
    super(4, new long[] {-1, 1, 1, -1, -1, 0, 2}, new long[] {13, 20, 30, 45, 68, 103, 156});
  }
}
