package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164459 Number of binary strings of length n with no substrings equal to 0001 0011 or 1100.
 * @author Sean A. Irvine
 */
public class A164459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164459() {
    super(new long[] {1, -1, 1, -2, 0, 0, 2}, new long[] {13, 21, 35, 58, 96, 159, 264});
  }
}
