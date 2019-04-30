package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192914 Constant term in the reduction by <code>(x^2 -&gt; x + 1)</code> of the polynomial <code>C(n)*x^n</code>, where C=A000285.
 * @author Sean A. Irvine
 */
public class A192914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192914() {
    super(new long[] {-1, 2, 2}, new long[] {1, 0, 5});
  }
}
