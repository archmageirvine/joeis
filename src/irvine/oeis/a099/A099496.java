package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099496 <code>a(n) = (-1)^n * Fibonacci(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A099496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099496() {
    super(new long[] {-1, -3}, new long[] {1, -2});
  }
}
