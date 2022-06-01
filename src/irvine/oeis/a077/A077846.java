package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077846 Expansion of 1/(1 - 3*x + 2*x^3).
 * @author Sean A. Irvine
 */
public class A077846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077846() {
    super(new long[] {-2, 0, 3}, new long[] {1, 3, 9});
  }
}
