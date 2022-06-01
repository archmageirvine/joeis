package irvine.oeis.a207;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A207077 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2 + (x+497)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A207077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207077() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 91, 216, 355, 387, 528, 568, 795, 1120, 1491, 1960, 2635, 3408, 3588, 4387, 4615, 5916, 7791, 9940});
  }
}
