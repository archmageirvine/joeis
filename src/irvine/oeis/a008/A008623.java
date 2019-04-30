package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008623 Molien series of 4-dimensional representation of <code>SL(2,7)</code>.
 * @author Sean A. Irvine
 */
public class A008623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008623() {
    super(new long[] {-1, 0, 1, 1, 1, -1, -1, 0, 0, 0, -1, -1, 1, 1, 1, 0},
      new long[] {1, 0, 1, 1, 3, 2, 5, 5, 9, 9, 14, 15, 22, 23, 32, 34});
  }
}

