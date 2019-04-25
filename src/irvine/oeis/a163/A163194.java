package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163194 <code>a(n) = F(n)^2 *</code> L(n+1)^2 <code>* F(n-1) *</code> L(n+2), where <code>F(n)</code> and L(n) are the Fibonacci and Lucas numbers, respectively.
 * @author Sean A. Irvine
 */
public class A163194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163194() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {0, 0, 112, 2156, 39204});
  }
}
