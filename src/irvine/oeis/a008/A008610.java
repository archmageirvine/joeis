package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008610 Molien series of 4-dimensional representation of cyclic group of order 4 over GF(2) (not Cohen-Macaulay).
 * @author Sean A. Irvine
 */
public class A008610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008610() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2},
      new long[] {1, 1, 3, 5, 10, 14, 22, 30});
  }
}

