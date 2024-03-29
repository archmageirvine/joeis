package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164500 Number of binary strings of length n with no substrings equal to 0010 1001 or 1010.
 * @author Sean A. Irvine
 */
public class A164500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164500() {
    super(4, new long[] {1, -1, 1, -1, 2}, new long[] {13, 21, 36, 60, 100});
  }
}
