package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192913 Coefficient of x^2 in the reduction by (x^3 -&gt; x + 1) of the polynomial F(n+1)*x^n, where F(n)=A000045 (Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A192913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192913() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {0, 0, 2, 3, 10, 32});
  }
}
