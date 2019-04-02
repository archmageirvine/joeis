package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192878 Constant term in the reduction by (x^2 -&gt; x + 1) of the polynomial p(n,x) given in Comments.
 * @author Sean A. Irvine
 */
public class A192878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192878() {
    super(new long[] {-1, 2, 2}, new long[] {3, 0, 4});
  }
}
