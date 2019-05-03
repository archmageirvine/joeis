package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164450 Number of binary strings of length n with no substrings equal to <code>0001 0010</code> or 1011.
 * @author Sean A. Irvine
 */
public class A164450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164450() {
    super(new long[] {-1, 2, -2, 0, 2}, new long[] {13, 21, 33, 51, 78});
  }
}
