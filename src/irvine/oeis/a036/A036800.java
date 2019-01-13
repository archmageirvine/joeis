package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036800.
 * @author Sean A. Irvine
 */
public class A036800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036800() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 2, 18, 90});
  }
}
