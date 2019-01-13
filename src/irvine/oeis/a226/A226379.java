package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226379.
 * @author Sean A. Irvine
 */
public class A226379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226379() {
    super(new long[] {1, -1, 0, 0, 0, -2, 2, 0, 0, 0, 1}, new long[] {0, -15, -3, 2, 3, 6, -7, 5, 12, 15, 20});
  }
}
