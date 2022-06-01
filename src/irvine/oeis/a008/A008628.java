package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008628 Molien series for A_5.
 * @author Sean A. Irvine
 */
public class A008628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008628() {
    super(new long[] {1, -1, -2, 1, 2, 0, -1, 1, 0, -2, -1, 2, 1},
      new long[] {1, 1, 2, 3, 5, 7, 10, 13, 18, 23, 31, 38, 49});
  }
}

