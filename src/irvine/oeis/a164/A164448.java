package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164448 Number of binary strings of length n with no substrings equal to 0001 0010 or 0111.
 * @author Sean A. Irvine
 */
public class A164448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164448() {
    super(4, new long[] {1, -1, 0, -1, 0, 2}, new long[] {13, 21, 33, 51, 77, 116});
  }
}
