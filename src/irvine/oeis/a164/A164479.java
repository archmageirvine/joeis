package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164479 Number of binary strings of length n with no substrings equal to <code>0001 0110</code> or 1011.
 * @author Sean A. Irvine
 */
public class A164479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164479() {
    super(new long[] {-1, 2, -1, -1, 0, 2}, new long[] {13, 21, 34, 54, 85, 133});
  }
}
