package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099014 a(n) = Fibonacci(n)*(Fibonacci(n-1)^2 + Fibonacci(n+1)^2).
 * @author Sean A. Irvine
 */
public class A099014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099014() {
    super(new long[] {-1, -3, 6, 3}, new long[] {0, 1, 5, 20});
  }
}
