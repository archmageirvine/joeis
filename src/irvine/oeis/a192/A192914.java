package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192914 Constant term in the reduction by (x^2 -&gt; x + 1) of the polynomial C(n)*x^n, where C=A000285.
 * @author Sean A. Irvine
 */
public class A192914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192914() {
    super(new long[] {-1, 2, 2}, new long[] {1, 0, 5});
  }
}
