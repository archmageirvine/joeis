package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210464.
 * @author Sean A. Irvine
 */
public class A210464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210464() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {4, 11, 18, 33, 48, 74});
  }
}
