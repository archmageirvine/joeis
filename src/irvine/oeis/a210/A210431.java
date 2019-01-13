package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210431.
 * @author Sean A. Irvine
 */
public class A210431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210431() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 30, 434, 3740, 22220, 100562, 370909, 1168008, 3245311});
  }
}
