package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107242 Sum of squares of tetranacci numbers (A001630).
 * @author Sean A. Irvine
 */
public class A107242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107242() {
    super(new long[] {-1, 1, 2, -2, 6, -2, -16, 6, 2, 2, 3}, new long[] {0, 0, 1, 5, 14, 50, 194, 723, 2659, 9884, 36780});
  }
}
