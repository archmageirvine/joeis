package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105838 Nonnegative integers n such that 11*n^2 + 11*n + 1 is a square.
 * @author Sean A. Irvine
 */
public class A105838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105838() {
    super(1, new long[] {1, -1, -398, 398, 1}, new long[] {0, 39, 159, 15720, 63480});
  }
}
