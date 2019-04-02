package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099921 a(n) = 5*Fibonacci(n)^2.
 * @author Sean A. Irvine
 */
public class A099921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099921() {
    super(new long[] {-1, 2, 2}, new long[] {5, 5, 20});
  }
}
