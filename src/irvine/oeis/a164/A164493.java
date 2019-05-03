package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164493 Number of binary strings of length n with no substrings equal to <code>0010 0101</code> or 1001.
 * @author Sean A. Irvine
 */
public class A164493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164493() {
    super(new long[] {1, 0, 1, -1, 1, -1, 2}, new long[] {13, 22, 38, 65, 111, 190, 326});
  }
}
