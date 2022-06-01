package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164401 Number of binary strings of length n with no substrings equal to 0010 or 0101.
 * @author Sean A. Irvine
 */
public class A164401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164401() {
    super(new long[] {1, 0, 0, 1, -1, 2}, new long[] {1, 2, 4, 8, 14, 25});
  }
}
