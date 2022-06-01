package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033192 a(n) = binomial(Fibonacci(n) + 1, 2).
 * @author Sean A. Irvine
 */
public class A033192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033192() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {0, 1, 1, 3, 6});
  }
}
