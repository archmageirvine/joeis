package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036572.
 * @author Sean A. Irvine
 */
public class A036572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036572() {
    super(new long[] {1, -2, 0, 2}, new long[] {3, 6, 10, 14});
  }
}
