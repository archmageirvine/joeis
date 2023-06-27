package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164496 Number of binary strings of length n with no substrings equal to 0010 0110 or 1001.
 * @author Sean A. Irvine
 */
public class A164496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164496() {
    super(4, new long[] {1, -1, 2, -2, 0, 2}, new long[] {13, 21, 35, 58, 96, 159});
  }
}
