package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192883 Constant term in the reduction by (x^2 -&gt; x + 1) of the polynomial F(n+3)*x^n, where F = A000045 (Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A192883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192883() {
    super(new long[] {-1, 2, 2}, new long[] {2, 0, 5});
  }
}
