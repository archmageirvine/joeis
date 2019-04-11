package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271359 <code>a(n) =</code> k*Fibonacci(2*n+1) + (k+1)*Fibonacci(2*n), where k=5.
 * @author Sean A. Irvine
 */
public class A271359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271359() {
    super(new long[] {-1, 3}, new long[] {5, 16});
  }
}
