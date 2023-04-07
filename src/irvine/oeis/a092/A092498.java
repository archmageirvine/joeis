package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092498 Expansion of g.f. (1 + x + 2*x^2)/((1 - x)^3*(1 - x^3)).
 * @author Sean A. Irvine
 */
public class A092498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092498() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 4, 11, 23, 41, 67});
  }
}
