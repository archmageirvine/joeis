package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192380 Coefficient of x in the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined below in Comments.
 * @author Sean A. Irvine
 */
public class A192380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192380() {
    super(1, new long[] {-1, -2, 6, 2}, new long[] {0, 2, 4, 20});
  }
}
