package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164473 Number of binary strings of length n with no substrings equal to 0001 0101 or 1011.
 * @author Sean A. Irvine
 */
public class A164473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164473() {
    super(new long[] {-1, 1, 0, -1, 1, -1, 2}, new long[] {13, 21, 34, 53, 82, 128, 198});
  }
}
