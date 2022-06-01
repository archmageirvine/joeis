package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192922 Constant term in the reduction by (x^2-&gt;x+1) of the polynomial p(n,x) defined below at Comments.
 * @author Sean A. Irvine
 */
public class A192922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192922() {
    super(new long[] {-1, -3, 2, 2}, new long[] {1, 0, 1, 2});
  }
}
