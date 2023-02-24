package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077859 Expansion of g.f. (1 - x)^(-1)/(1 - 2*x + 2*x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A077859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077859() {
    super(new long[] {-1, 3, -4, 3}, new long[] {1, 3, 5, 6});
  }
}
