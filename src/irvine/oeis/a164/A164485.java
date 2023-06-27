package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164485 Number of binary strings of length n with no substrings equal to 0001, 1000 or 1001.
 * @author Sean A. Irvine
 */
public class A164485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164485() {
    super(4, new long[] {-1, 0, 2}, new long[] {13, 21, 33});
  }
}
