package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077836 Expansion of (1-x)/(1-3*x-3*x^2-3*x^3).
 * @author Sean A. Irvine
 */
public class A077836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077836() {
    super(new long[] {3, 3, 3}, new long[] {1, 2, 9});
  }
}
