package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164494 Number of binary strings of length n with no substrings equal to <code>0010 0101</code> or 1010.
 * @author Sean A. Irvine
 */
public class A164494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164494() {
    super(new long[] {1, -1, 2}, new long[] {13, 23, 40});
  }
}
