package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064761.
 * @author Sean A. Irvine
 */
public class A064761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064761() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 60});
  }
}
