package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164484 Number of binary strings of length n with no substrings equal to 0001 0111 or 1100.
 * @author Sean A. Irvine
 */
public class A164484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164484() {
    super(4, new long[] {2, -3, 0, 0, 2}, new long[] {13, 20, 31, 48, 74});
  }
}
