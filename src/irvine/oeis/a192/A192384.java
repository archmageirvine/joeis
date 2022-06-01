package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192384 Coefficient of x in the reduction by x^2-&gt;x+1 of the polynomial p(n,x) defined below in Comments.
 * @author Sean A. Irvine
 */
public class A192384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192384() {
    super(new long[] {-4, -4, 8, 2}, new long[] {0, 2, 4, 24});
  }
}
