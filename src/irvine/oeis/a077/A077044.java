package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077044 Largest coefficient in expansion of <code>(1 + x + x^2 +</code> ... <code>+ x^(n-1))^5 = ((1-x^n)/(1-x))^5</code>, i.e., the coefficient of <code>x^floor(5*(n-1)/2)</code> and of <code>x^ceiling(5*(n-1)/2)</code>; also number of compositions of <code>floor(5*(n+1)/2)</code> into exactly 5 positive integers each no more than n.
 * @author Sean A. Irvine
 */
public class A077044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077044() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 10, 51, 155, 381, 780, 1451});
  }
}
