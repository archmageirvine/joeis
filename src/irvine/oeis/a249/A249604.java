package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249604 a(n) = Sum_{i=1..n} Fibonacci(i)*10^(i-1).
 * @author Sean A. Irvine
 */
public class A249604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249604() {
    super(new long[] {-100, 90, 11}, new long[] {1, 11, 211});
  }
}
