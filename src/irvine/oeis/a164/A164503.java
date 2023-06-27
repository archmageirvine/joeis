package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164503 Number of binary strings of length n with no substrings equal to 0011 0101 or 0110.
 * @author Sean A. Irvine
 */
public class A164503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164503() {
    super(4, new long[] {-1, 0, -1, 0, 1, -1, 2}, new long[] {13, 21, 34, 55, 87, 136, 211});
  }
}
