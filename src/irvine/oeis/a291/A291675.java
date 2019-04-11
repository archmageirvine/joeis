package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291675 <code>a(n) = a(n-1) + 2*a(n-2) +</code> 8*Fibonacci(n) + 2*Fibonacci(n-1); <code>a(1) = 4, a(2) = 14</code>.
 * @author Sean A. Irvine
 */
public class A291675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291675() {
    super(new long[] {-2, -3, 2, 2}, new long[] {4, 14, 40, 96});
  }
}
