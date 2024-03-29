package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164445 Number of binary strings of length n with no substrings equal to 0001 0010 or 0100.
 * @author Sean A. Irvine
 */
public class A164445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164445() {
    super(4, new long[] {-1, 0, 1, 0, 1, 1}, new long[] {13, 22, 38, 66, 113, 193});
  }
}
