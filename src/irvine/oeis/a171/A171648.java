package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171648 <code>a(1) = 1, a(n) = 2*a(n-1)</code> if n is even; <code>a(n) =</code> a(n-1)*Fibonacci((n+1)/2)/Fibonacci((n-1)/2) if n is odd.
 * @author Sean A. Irvine
 */
public class A171648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171648() {
    super(new long[] {4, 0, 2, 0}, new long[] {1, 2, 2, 4});
  }
}
