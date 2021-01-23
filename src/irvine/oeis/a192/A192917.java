package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192917 Coefficient of x in the reduction by (x^2 -&gt; x+1) of the polynomial C(n)*x^n, where C=A022095.
 * @author Sean A. Irvine
 */
public class A192917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192917() {
    super(new long[] {-1, 2, 2}, new long[] {0, 5, 6});
  }
}
