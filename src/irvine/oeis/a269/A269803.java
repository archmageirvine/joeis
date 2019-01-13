package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269803.
 * @author Sean A. Irvine
 */
public class A269803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269803() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {1, 5, 13, 37, 99});
  }
}
