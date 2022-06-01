package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134502 a(n) = Fibonacci(7n + 4).
 * @author Sean A. Irvine
 */
public class A134502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134502() {
    super(new long[] {1, 29}, new long[] {3, 89});
  }
}
