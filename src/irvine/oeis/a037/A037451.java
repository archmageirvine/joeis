package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037451 a(n) = Fibonacci(n) * Fibonacci(2*n).
 * @author Sean A. Irvine
 */
public class A037451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037451() {
    super(new long[] {-1, -3, 6, 3}, new long[] {0, 1, 3, 16});
  }
}
