package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137249 Expansion of g.f. z*(2-2*z+z^2+z^3)/((1+z)*(1-3*z+2*z^2-z^3)).
 * @author Sean A. Irvine
 */
public class A137249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137249() {
    super(1, new long[] {1, -1, 1, 2}, new long[] {2, 2, 7, 15});
  }
}
