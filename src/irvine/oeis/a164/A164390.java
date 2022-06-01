package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164390 Number of binary strings of length n with no substrings equal to 0000 or 0110.
 * @author Sean A. Irvine
 */
public class A164390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164390() {
    super(new long[] {1, 0, 1, 0, 1, 1}, new long[] {1, 2, 4, 8, 14, 25});
  }
}
