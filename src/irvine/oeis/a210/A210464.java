package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210464 Number of bracelets with 2 blue, 2 red, and n black beads.
 * @author Sean A. Irvine
 */
public class A210464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210464() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {4, 11, 18, 33, 48, 74});
  }
}
