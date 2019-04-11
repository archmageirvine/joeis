package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165900 Values of Fibonacci polynomial <code>n^2 - n - 1</code>.
 * @author Sean A. Irvine
 */
public class A165900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165900() {
    super(new long[] {1, -3, 3}, new long[] {-1, -1, 1});
  }
}
