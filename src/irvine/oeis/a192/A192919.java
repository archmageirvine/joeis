package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192919 Constant term in the reduction by (x^2 -&gt; x+1) of the polynomial F(n+4)*x^n, where F=A000045 (Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A192919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192919() {
    super(new long[] {-1, 2, 2}, new long[] {3, 0, 8});
  }
}
