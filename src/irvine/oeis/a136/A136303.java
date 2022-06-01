package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136303 Expansion of g.f. (1 +x^2)/((1-x)^2*(1 -3*x +2*x^2 -x^3)).
 * @author Sean A. Irvine
 */
public class A136303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136303() {
    super(new long[] {1, -4, 8, -9, 5}, new long[] {1, 5, 17, 48, 123});
  }
}
