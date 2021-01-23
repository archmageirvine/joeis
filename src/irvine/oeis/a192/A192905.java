package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192905 Coefficient of x in the reduction by (x^2 -&gt; x + 1) of the polynomial p(n,x) defined below at Comments.
 * @author Sean A. Irvine
 */
public class A192905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192905() {
    super(new long[] {1, 1, 0, 3}, new long[] {0, 1, 3, 8});
  }
}
