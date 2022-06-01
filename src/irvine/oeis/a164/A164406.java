package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164406 Number of binary strings of length n with no substrings equal to 0011 or 0101.
 * @author Sean A. Irvine
 */
public class A164406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164406() {
    super(new long[] {-1, 0, -2, 2, -1, 2}, new long[] {1, 2, 4, 8, 14, 24});
  }
}
