package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119284 Alternating sum of the cubes of the first n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A119284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119284() {
    super(new long[] {1, -4, -3, 9, -2}, new long[] {0, -1, 0, -8, 19});
  }
}
