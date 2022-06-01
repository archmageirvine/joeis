package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163197 a(n) = (1/4)* L(n)^2 * F(n+1)^2 * L(n-1) * F(n+2), where F(n) and L(n) are the Fibonacci and Lucas numbers, respectively.
 * @author Sean A. Irvine
 */
public class A163197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163197() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {-1, 1, 27, 540, 9800});
  }
}
