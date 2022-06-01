package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134503 a(n) = Fibonacci(7n + 5).
 * @author Sean A. Irvine
 */
public class A134503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134503() {
    super(new long[] {1, 29}, new long[] {5, 144});
  }
}
