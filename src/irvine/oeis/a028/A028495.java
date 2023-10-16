package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028495 Expansion of g.f. (1-x^2)/(1-x-2*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A028495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028495() {
    super(new long[] {-1, 2, 1}, new long[] {1, 1, 2});
  }
}
