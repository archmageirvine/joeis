package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271357 <code>a(n) = k*Fibonacci(2*n+1) + (k+1)*Fibonacci(2*n)</code>, where <code>k=3</code>.
 * @author Sean A. Irvine
 */
public class A271357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271357() {
    super(new long[] {-1, 3}, new long[] {3, 10});
  }
}
