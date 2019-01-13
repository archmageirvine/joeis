package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077822.
 * @author Sean A. Irvine
 */
public class A077822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077822() {
    super(new long[] {-2, -1, 0, 4}, new long[] {1, 4, 16, 63});
  }
}
