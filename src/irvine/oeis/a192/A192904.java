package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192904 Constant term in the reduction by <code>(x^2 -&gt; x + 1)</code> of the polynomial <code>p(n,x)</code> defined below at Comments.
 * @author Sean A. Irvine
 */
public class A192904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192904() {
    super(new long[] {1, 1, 0, 3}, new long[] {1, 0, 1, 5});
  }
}
