package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267804.
 * @author Sean A. Irvine
 */
public class A267804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267804() {
    super(new long[] {-10000, 0, 10001, 0}, new long[] {1, 111, 10111, 1100111});
  }
}
