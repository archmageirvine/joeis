package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192911 Constant term in the reduction by <code>(x^3 -&gt; x + 1)</code> of the polynomial <code>F(n+1)*x^n</code>, where <code>F(n)=A000045 (Fibonacci</code> sequence).
 * @author Sean A. Irvine
 */
public class A192911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192911() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {1, 0, 0, 3, 5, 16});
  }
}
