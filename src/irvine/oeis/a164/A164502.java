package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164502 Number of binary strings of length n with no substrings equal to 0010 1011 or 1100.
 * @author Sean A. Irvine
 */
public class A164502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164502() {
    super(new long[] {1, 0, 1, -2, 0, 2}, new long[] {13, 20, 31, 48, 74, 114});
  }
}
