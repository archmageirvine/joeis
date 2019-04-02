package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285197 Expansion of (1-6*x+11*x^2-5*x^3) / ((1-x)*(1-3*x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A285197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285197() {
    super(new long[] {-3, 13, -16, 7}, new long[] {1, 1, 2, 6});
  }
}
