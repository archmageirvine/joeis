package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164462 Number of binary strings of length n with no substrings equal to <code>0001 0100</code> or 0101.
 * @author Sean A. Irvine
 */
public class A164462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164462() {
    super(new long[] {-1, 0, 1, -1, 2}, new long[] {13, 20, 33, 55, 89});
  }
}
