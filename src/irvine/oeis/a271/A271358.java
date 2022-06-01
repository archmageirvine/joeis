package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271358 a(n) = k*Fibonacci(2*n+1) + (k+1)*Fibonacci(2*n), where k=4.
 * @author Sean A. Irvine
 */
public class A271358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271358() {
    super(new long[] {-1, 3}, new long[] {4, 13});
  }
}
