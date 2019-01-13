package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107243.
 * @author Sean A. Irvine
 */
public class A107243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107243() {
    super(new long[] {-1, 1, 0, -1, 1, 10, -6, -4, 6, -2, -32, 14, 7, 3, 2, 3}, new long[] {0, 0, 0, 0, 1, 2, 6, 22, 86, 342, 1303, 5024, 19424, 75120, 290416, 1122160});
  }
}
