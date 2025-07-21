package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064551 Ado [Simone Caramel]'s function: a(0) = 1, a(n) = a(n-1) + 2*(Fibonacci(n+1)-n), n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064551() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 1, 1, 1, 3});
  }
}
