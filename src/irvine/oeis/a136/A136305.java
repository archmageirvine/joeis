package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136305 Expansion of g.f. (3 -x +2*x^2)/(1 -3*x +2*x^2 -x^3).
 * @author Sean A. Irvine
 */
public class A136305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136305() {
    super(new long[] {1, -2, 3}, new long[] {3, 8, 20});
  }
}
