package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237530.
 * @author Sean A. Irvine
 */
public class A237530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237530() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 4, 22, 82, 231, 566, 1216, 2410, 4428, 7712, 12780, 20392});
  }
}
