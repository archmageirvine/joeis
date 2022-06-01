package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266677 Alternating sum of hexagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A266677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266677() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 6, -16, 34});
  }
}
