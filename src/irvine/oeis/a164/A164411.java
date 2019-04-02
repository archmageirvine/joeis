package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164411 Number of binary strings of length n with no substrings equal to 0000, 0001, or 0110.
 * @author Sean A. Irvine
 */
public class A164411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164411() {
    super(new long[] {1, 0, 0, 1, 1}, new long[] {1, 2, 4, 8, 13});
  }
}
