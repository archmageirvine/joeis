package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192760 Coefficient of x in the reduction by <code>x^2-&gt;x+1</code> of the polynomial p(n,x) defined below in Comments.
 * @author Sean A. Irvine
 */
public class A192760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192760() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 4, 9});
  }
}
