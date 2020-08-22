package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163196 a(n) = L(n)^2 * F(n+1)^2 * L(n-1) * F(n+2), where F(n) and L(n) are the Fibonacci and Lucas numbers, respectively.
 * @author Sean A. Irvine
 */
public class A163196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163196() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {-4, 4, 108, 2160, 39200});
  }
}
