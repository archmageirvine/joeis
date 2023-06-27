package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164464 Number of binary strings of length n with no substrings equal to 0001, 0100, or 0111.
 * @author Sean A. Irvine
 */
public class A164464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164464() {
    super(4, new long[] {-1, 1, -1, 2}, new long[] {13, 20, 31, 47});
  }
}
