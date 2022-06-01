package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266297 Numbers whose last digit is a square.
 * @author Sean A. Irvine
 */
public class A266297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266297() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 4, 9, 10});
  }
}
