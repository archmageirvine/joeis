package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008629 Molien series for A_6.
 * @author Sean A. Irvine
 */
public class A008629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008629() {
    super(new long[] {-1, 1, 1, 1, -1, -2, -1, -1, 2, 2, 2, -1, -1, -2, -1, 1, 1, 1},
      new long[] {1, 1, 2, 3, 5, 7, 11, 14, 20, 26, 35, 44, 58, 71, 90, 111, 137, 165});
  }
}

