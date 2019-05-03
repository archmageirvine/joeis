package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164435 Number of binary strings of length n with no substrings equal to <code>0000 0101</code> or 1011.
 * @author Sean A. Irvine
 */
public class A164435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164435() {
    super(new long[] {1, 1, 0, 1, 1, 0, 1}, new long[] {13, 22, 37, 62, 104, 175, 295});
  }
}
