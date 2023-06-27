package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164456 Number of binary strings of length n with no substrings equal to 0001 0011 or 1000.
 * @author Sean A. Irvine
 */
public class A164456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164456() {
    super(4, new long[] {1, -2, 0, 0, 2}, new long[] {13, 22, 37, 63, 108});
  }
}
