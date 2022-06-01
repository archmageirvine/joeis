package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282465 a(n) = 11*Fibonacci(n+3) + Fibonacci(n-8) with n&gt;=0.
 * @author Sean A. Irvine
 */
public class A282465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282465() {
    super(new long[] {1, 1}, new long[] {1, 46});
  }
}
