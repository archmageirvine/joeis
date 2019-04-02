package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171647 a(1) = 1; for n&gt;1, a(n) = 2*a(n-1) if n is even, a(n) = ((n+1)/(n-1))*a(n-1) if n is odd.
 * @author Sean A. Irvine
 */
public class A171647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171647() {
    super(new long[] {-4, 0, 4, 0}, new long[] {1, 2, 4, 8});
  }
}
