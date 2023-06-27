package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164398 Number of binary strings of length n with no substrings equal to 0001 or 1000.
 * @author Sean A. Irvine
 */
public class A164398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164398() {
    super(4, new long[] {-1, 0, 0, 2}, new long[] {14, 25, 45, 82});
  }
}
