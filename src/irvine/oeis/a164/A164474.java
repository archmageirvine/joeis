package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164474 Number of binary strings of length n with no substrings equal to 0001 0101 or 1100.
 * @author Sean A. Irvine
 */
public class A164474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164474() {
    super(4, new long[] {1, -3, 2, -1, 2}, new long[] {13, 20, 31, 48, 74});
  }
}
