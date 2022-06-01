package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165900 Values of Fibonacci polynomial n^2 - n - 1.
 * @author Sean A. Irvine
 */
public class A165900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165900() {
    super(new long[] {1, -3, 3}, new long[] {-1, -1, 1});
  }
}
