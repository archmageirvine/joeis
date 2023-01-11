package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008624 Expansion of g.f. (1 + x^3)/((1 - x^2)*(1 - x^4)) = (1 - x + x^2)/((1 + x)*(1 - x)^2*(1 + x^2)).
 * @author Sean A. Irvine
 */
public class A008624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008624() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 0, 1, 1, 2});
  }
}

