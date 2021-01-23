package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064551 Ado [Simone Caramel]'s Fibonacci function: define the Fibonacci sequence by f(0) = 1, f(1) = 1, f(n) = f(n-1)+f(n-2); then a(0) = 1, a(n) = a(n-1) + 2*(f(n)-n), n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064551() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 1, 1, 1, 3});
  }
}
