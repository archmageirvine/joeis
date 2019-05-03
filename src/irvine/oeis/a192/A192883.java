package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192883 Constant term in the reduction by <code>(x^2 -&gt; x + 1)</code> of the polynomial <code>F(n+3)*x^n</code>, where F <code>= A000045 (Fibonacci</code> sequence).
 * @author Sean A. Irvine
 */
public class A192883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192883() {
    super(new long[] {-1, 2, 2}, new long[] {2, 0, 5});
  }
}
