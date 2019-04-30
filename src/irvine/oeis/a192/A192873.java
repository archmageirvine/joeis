package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192873 Coefficient of x in the reduction by <code>(x^2-&gt;x+1)</code> of the polynomial <code>p(n,x)</code> given in Comments.
 * @author Sean A. Irvine
 */
public class A192873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192873() {
    super(new long[] {1, -3, 0, 3}, new long[] {0, 1, 2, 7});
  }
}
