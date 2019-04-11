package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271358 <code>a(n) =</code> k*Fibonacci(2*n+1) + (k+1)*Fibonacci(2*n), where <code>k=4</code>.
 * @author Sean A. Irvine
 */
public class A271358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271358() {
    super(new long[] {-1, 3}, new long[] {4, 13});
  }
}
