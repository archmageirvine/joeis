package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077861.
 * @author Sean A. Irvine
 */
public class A077861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077861() {
    super(new long[] {1, 1, -4, 3}, new long[] {1, 3, 5, 4});
  }
}
