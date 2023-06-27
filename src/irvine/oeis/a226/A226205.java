package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226205 a(n) = F(n)^2 - F(n-1)^2 or F(n+1) * F(n-2) where F(n) = A000045(n), the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A226205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226205() {
    super(1, new long[] {-1, 2, 2}, new long[] {1, 0, 3});
  }
}
