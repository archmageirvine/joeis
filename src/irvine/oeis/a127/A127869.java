package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127869 Number of L-shaped tiles in all tilings of a 3 X n board with 1 X 1 and L-shaped tiles (where the L-shaped tiles cover 3 squares).
 * @author Sean A. Irvine
 */
public class A127869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127869() {
    super(new long[] {-4, 4, -29, 2, -39, -44, 5, 6}, new long[] {12, 60, 432, 2348, 13144, 69280, 361012, 1841736});
  }
}
