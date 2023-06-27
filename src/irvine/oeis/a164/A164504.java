package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164504 Number of binary strings of length n with no substrings equal to 0011 0101 or 1010.
 * @author Sean A. Irvine
 */
public class A164504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164504() {
    super(4, new long[] {-1, 0, -2, 2, -1, 2}, new long[] {13, 22, 36, 58, 93, 148});
  }
}
