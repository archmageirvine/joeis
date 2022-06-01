package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098523 Expansion of (1+x^2)/(1-x-x^5) = (1+x^2)/((1-x+x^2)*(1-x^2-x^3)).
 * @author Sean A. Irvine
 */
public class A098523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098523() {
    super(new long[] {1, 0, 0, 0, 1}, new long[] {1, 1, 2, 2, 2});
  }
}
