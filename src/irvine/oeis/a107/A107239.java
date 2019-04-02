package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107239 Sum of squares of tribonacci numbers (A000073).
 * @author Sean A. Irvine
 */
public class A107239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107239() {
    super(new long[] {1, -1, 1, -7, 3, 1, 3}, new long[] {0, 0, 1, 2, 6, 22, 71});
  }
}
