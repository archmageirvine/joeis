package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127864 Number of tilings of a 2 X n board with 1 X 1 and L-shaped tiles (where the L-shaped tiles cover 3 squares).
 * @author Sean A. Irvine
 */
public class A127864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127864() {
    super(new long[] {2, 4, 1}, new long[] {1, 1, 5});
  }
}
