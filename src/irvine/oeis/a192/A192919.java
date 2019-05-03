package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192919 Constant term in the reduction by <code>(x^2-&gt;x+1)</code> of the polynomial <code>F(n+4)*x^n</code>, where <code>F=A000045</code> (Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A192919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192919() {
    super(new long[] {-1, 2, 2}, new long[] {3, 0, 8});
  }
}
