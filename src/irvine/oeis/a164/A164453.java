package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164453 Number of binary strings of length n with no substrings equal to <code>0001 0011</code> or 0100.
 * @author Sean A. Irvine
 */
public class A164453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164453() {
    super(new long[] {1, -1, 1, -1, 2}, new long[] {13, 21, 35, 58, 97});
  }
}
