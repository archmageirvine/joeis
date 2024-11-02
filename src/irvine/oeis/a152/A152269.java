package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152269 Expansion of g.f. x*(1-3*x-8*x^2)/(1+5*x^2-32*x^4).
 * @author Sean A. Irvine
 */
public class A152269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152269() {
    super(new long[] {32, 0, -5, 0}, new long[] {0, 1, -3, -13});
  }
}
