package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164436 Number of binary strings of length n with no substrings equal to 0000 0101 or 1110.
 * @author Sean A. Irvine
 */
public class A164436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164436() {
    super(4, new long[] {-1, -1, 0, 2, 0, 1}, new long[] {13, 21, 33, 52, 81, 126});
  }
}
