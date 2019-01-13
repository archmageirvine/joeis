package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165718.
 * @author Sean A. Irvine
 */
public class A165718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165718() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {3, 5, 10, 13, 20});
  }
}
