package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164426 Number of binary strings of length n with no substrings equal to 0000 0011 or 0101.
 * @author Sean A. Irvine
 */
public class A164426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164426() {
    super(4, new long[] {-1, -1, -1, 0, 2, 0, 1}, new long[] {13, 21, 34, 53, 81, 124, 188});
  }
}
