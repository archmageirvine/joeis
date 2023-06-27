package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263615 Partial sums of A263614 starting at n=2.
 * @author Sean A. Irvine
 */
public class A263615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263615() {
    super(2, new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {2, 4, 8, 12, 20, 28, 44, 59, 89});
  }
}
