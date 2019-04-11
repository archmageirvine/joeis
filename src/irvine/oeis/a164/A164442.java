package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164442 Number of binary strings of length n with no substrings equal to <code>0000 0111</code> or 1001.
 * @author Sean A. Irvine
 */
public class A164442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164442() {
    super(new long[] {-1, 0, 0, 0, 1, 1}, new long[] {13, 21, 33, 51, 79, 122});
  }
}
