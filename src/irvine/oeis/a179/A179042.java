package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179042 Partial sums of ceiling(Fibonacci(n)/4).
 * @author Sean A. Irvine
 */
public class A179042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179042() {
    super(new long[] {1, 0, -2, 1, 0, 0, -1, 0, 2}, new long[] {0, 1, 2, 3, 4, 6, 8, 12, 18});
  }
}
