package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192978 Coefficient of x in the reduction by x^2 -&gt; x+1 of the polynomial p(n,x) defined at Comments.
 * @author Sean A. Irvine
 */
public class A192978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192978() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 1, 4, 12, 29});
  }
}
