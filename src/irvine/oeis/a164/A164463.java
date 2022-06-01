package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164463 Number of binary strings of length n with no substrings equal to 0001 0100 or 0110.
 * @author Sean A. Irvine
 */
public class A164463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164463() {
    super(new long[] {1, 0, -1, 2}, new long[] {13, 20, 31, 50});
  }
}
