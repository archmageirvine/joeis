package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192805 Constant term in the reduction of the polynomial <code>1+x+x^2+...+x^n</code> by <code>x^3-&gt;x^2+2x+1. </code> See Comments.
 * @author Sean A. Irvine
 */
public class A192805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192805() {
    super(new long[] {-1, -1, 1, 2}, new long[] {1, 1, 1, 2});
  }
}
