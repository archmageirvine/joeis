package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282464 a(n) = Sum_{i=0..n} i*Fibonacci(i)^2.
 * @author Sean A. Irvine
 */
public class A282464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282464() {
    super(new long[] {1, -5, 4, 10, -10, -4, 5}, new long[] {0, 1, 3, 15, 51, 176, 560});
  }
}
