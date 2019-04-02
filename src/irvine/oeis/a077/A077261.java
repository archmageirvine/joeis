package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077261 Triangular numbers that are 5x another triangular number.
 * @author Sean A. Irvine
 */
public class A077261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077261() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {0, 15, 105, 4950, 33930});
  }
}
