package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163194 a(n) = F(n)^2 * L(n+1)^2 * F(n-1) * L(n+2), where F(n) and L(n) are the Fibonacci and Lucas numbers, respectively.
 * @author Sean A. Irvine
 */
public class A163194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163194() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {0, 0, 112, 2156, 39204});
  }
}
