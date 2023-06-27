package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164462 Number of binary strings of length n with no substrings equal to 0001 0100 or 0101.
 * @author Sean A. Irvine
 */
public class A164462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164462() {
    super(4, new long[] {-1, 0, 1, -1, 2}, new long[] {13, 20, 33, 55, 89});
  }
}
