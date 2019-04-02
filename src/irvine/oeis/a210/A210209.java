package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210209 GCD of all sums of n consecutive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A210209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210209() {
    super(new long[] {1, 0, 0, 0, -3, 0, -1, 0, 1, 0, 3, 0, 0, 0}, new long[] {0, 1, 1, 2, 1, 1, 4, 1, 3, 2, 11, 1, 8, 1});
  }
}
