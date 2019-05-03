package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127869 Number of L-shaped tiles in all tilings of a <code>3xn</code> board with <code>1x1</code> and L-shaped tiles (where the L-shaped tiles cover <code>3 squares)</code>.
 * @author Sean A. Irvine
 */
public class A127869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127869() {
    super(new long[] {-4, 4, -29, 2, -39, -44, 5, 6}, new long[] {12, 60, 432, 2348, 13144, 69280, 361012, 1841736});
  }
}
