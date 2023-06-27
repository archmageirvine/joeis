package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164452 Number of binary strings of length n with no substrings equal to 0001 0010 or 1101.
 * @author Sean A. Irvine
 */
public class A164452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164452() {
    super(4, new long[] {1, -2, 1, 1, -3, 3}, new long[] {13, 21, 32, 48, 70, 101});
  }
}
