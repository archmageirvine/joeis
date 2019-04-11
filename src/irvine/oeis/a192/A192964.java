package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192964 Constant term of the reduction by <code>x^2-&gt;x+1</code> of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A192964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192964() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 0, 3, 7});
  }
}
