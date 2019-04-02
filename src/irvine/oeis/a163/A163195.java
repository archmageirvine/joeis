package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163195 a(n) = (1/4)*F(n)^2 * L(n+1)^2 * F(n-1) * L(n+2), where F(n) and L(n) are the Fibonacci and Lucas numbers, respectively.
 * @author Sean A. Irvine
 */
public class A163195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163195() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {0, 0, 28, 539, 9801});
  }
}
