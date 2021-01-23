package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181305 Number of increasing columns in all 2-compositions of n. A 2-composition of n is a nonnegative matrix with two rows, such that each column has at least one nonzero entry and whose entries sum up to n.
 * @author Sean A. Irvine
 */
public class A181305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181305() {
    super(new long[] {-4, 12, -4, -12, 7}, new long[] {0, 1, 5, 24, 104});
  }
}
