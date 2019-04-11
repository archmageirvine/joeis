package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164433 Number of binary strings of length n with no substrings equal to <code>0000 0101</code> or 0111.
 * @author Sean A. Irvine
 */
public class A164433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164433() {
    super(new long[] {-1, -1, 0, 2, 0, 1}, new long[] {13, 21, 34, 54, 84, 131});
  }
}
