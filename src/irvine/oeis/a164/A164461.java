package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164461 Number of binary strings of length n with no substrings equal to 0001 0011 or 1110.
 * @author Sean A. Irvine
 */
public class A164461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164461() {
    super(new long[] {-2, 1, 1, 1}, new long[] {13, 21, 33, 51});
  }
}
