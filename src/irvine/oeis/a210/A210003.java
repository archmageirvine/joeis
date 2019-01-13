package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210003.
 * @author Sean A. Irvine
 */
public class A210003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210003() {
    super(new long[] {1, -1, 0, 0, 2}, new long[] {1, 2, 4, 8, 16});
  }
}
