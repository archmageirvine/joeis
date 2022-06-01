package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049667 a(n) = Fibonacci(7*n)/13.
 * @author Sean A. Irvine
 */
public class A049667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049667() {
    super(new long[] {1, 29}, new long[] {0, 1});
  }
}
