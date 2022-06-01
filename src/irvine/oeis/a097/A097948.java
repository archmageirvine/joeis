package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097948 G.f.: -(1-3*x^2-x^3)/(1+4*x-4*x^3-x^4).
 * @author Sean A. Irvine
 */
public class A097948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097948() {
    super(new long[] {1, 4, 0, -4}, new long[] {-1, 4, -13, 49});
  }
}
