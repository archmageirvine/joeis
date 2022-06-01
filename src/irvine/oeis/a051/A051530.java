package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051530 Molien series for group H_{1,3} of order 1152.
 * @author Sean A. Irvine
 */
public class A051530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051530() {
    super(new long[] {-1, 1, 1, 0, -1, -1, 2, -1, -1, 0, 1, 1}, new long[] {1, 0, 1, 3, 4, 5, 15, 14, 24, 35, 44, 54});
  }
}
