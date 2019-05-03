package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192913 Coefficient of <code>x^2</code> in the reduction by <code>(x^3 -&gt; x + 1)</code> of the polynomial <code>F(n+1)*x^n</code>, where <code>F(n)=A000045 (Fibonacci</code> sequence).
 * @author Sean A. Irvine
 */
public class A192913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192913() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {0, 0, 2, 3, 10, 32});
  }
}
