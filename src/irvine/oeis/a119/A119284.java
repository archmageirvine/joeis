package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119284.
 * @author Sean A. Irvine
 */
public class A119284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119284() {
    super(new long[] {1, -4, -3, 9, -2}, new long[] {0, -1, 0, -8, 19});
  }
}
