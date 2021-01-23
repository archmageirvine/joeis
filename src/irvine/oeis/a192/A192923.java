package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192923 Coefficient of x in the reduction by (x^2-&gt;x+1) of the polynomial p(n,x) defined below at Comments.
 * @author Sean A. Irvine
 */
public class A192923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192923() {
    super(new long[] {-1, -3, 2, 2}, new long[] {0, 1, 2, 4});
  }
}
