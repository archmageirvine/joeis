package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192377 Coefficient of x in the reduction by x^2-&gt;x+2 of the polynomial p(n,x) defined below in Comments.
 * @author Sean A. Irvine
 */
public class A192377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192377() {
    super(new long[] {-1, 2, 6, 2}, new long[] {0, 2, 4, 20});
  }
}
