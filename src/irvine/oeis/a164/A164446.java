package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164446 Number of binary strings of length n with no substrings equal to <code>0001 0010</code> or 0101.
 * @author Sean A. Irvine
 */
public class A164446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164446() {
    super(new long[] {-1, 1, -1, 0, 1, -1, 2}, new long[] {13, 22, 37, 62, 103, 172, 286});
  }
}
