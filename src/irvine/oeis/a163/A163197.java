package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163197 <code>a(n) = (1/4)*</code> L(n)^2 <code>* F(n+1)^2 *</code> L(n-1) <code>* F(n+2),</code> where <code>F(n)</code> and L(n) are the Fibonacci and Lucas numbers, respectively.
 * @author Sean A. Irvine
 */
public class A163197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163197() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {-1, 1, 27, 540, 9800});
  }
}
