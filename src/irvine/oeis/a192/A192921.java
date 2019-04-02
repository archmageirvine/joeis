package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192921 Constant term in the reduction by (x^2-&gt;x+1) of the polynomial p(n,x) defined below at Comments.
 * @author Sean A. Irvine
 */
public class A192921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192921() {
    super(new long[] {-1, 2, 2}, new long[] {1, 2, 2});
  }
}
