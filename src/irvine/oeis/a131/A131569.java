package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131569 a(n) = (1/2)*(F(n+2)-1)*(F(n+2)-2) + F(n), where F() are the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A131569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131569() {
    super(1, new long[] {-1, 2, 4, -6, -2, 4}, new long[] {1, 2, 8, 24, 71, 198});
  }
}
