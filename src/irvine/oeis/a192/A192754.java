package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192754 Constant term of the reduction by <code>x^2-&gt;x+1</code> of the polynomial p(n,x) defined below in Comments.
 * @author Sean A. Irvine
 */
public class A192754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192754() {
    super(new long[] {-1, 0, 2}, new long[] {1, 6, 12});
  }
}
