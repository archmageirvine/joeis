package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192912 Coefficient of x in the reduction by <code>(x^3 -&gt; x + 1)</code> of the polynomial <code>F(n+1)*x^n,</code> where F(n)=A000045 (Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A192912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192912() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {0, 1, 0, 3, 10, 24});
  }
}
