package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164501 Number of binary strings of length n with no substrings equal to 0010 1001 or 1100.
 * @author Sean A. Irvine
 */
public class A164501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164501() {
    super(new long[] {1, 0, 0, 0, -1, 0, 2}, new long[] {13, 22, 37, 62, 105, 177, 300});
  }
}
