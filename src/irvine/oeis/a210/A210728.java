package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210728.
 * @author Sean A. Irvine
 */
public class A210728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210728() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 7, 14});
  }
}
