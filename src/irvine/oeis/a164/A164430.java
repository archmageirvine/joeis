package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164430 Number of binary strings of length n with no substrings equal to 0000 0011 or 1100.
 * @author Sean A. Irvine
 */
public class A164430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164430() {
    super(4, new long[] {-1, -1, -1, 0, 1, 1, 1}, new long[] {13, 21, 36, 62, 105, 178, 303});
  }
}
