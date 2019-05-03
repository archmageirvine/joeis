package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164474 Number of binary strings of length n with no substrings equal to <code>0001 0101</code> or 1100.
 * @author Sean A. Irvine
 */
public class A164474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164474() {
    super(new long[] {1, -3, 2, -1, 2}, new long[] {13, 20, 31, 48, 74});
  }
}
