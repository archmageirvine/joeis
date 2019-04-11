package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236144 <code>a(n) =</code> F(floor( <code>(n+3)/2 )) *</code> L(floor( <code>(n+2)/2 ))</code> where F=Fibonacci and L=Lucas numbers.
 * @author Sean A. Irvine
 */
public class A236144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236144() {
    super(new long[] {1, 1, 0, 1}, new long[] {2, 2, 1, 2});
  }
}
