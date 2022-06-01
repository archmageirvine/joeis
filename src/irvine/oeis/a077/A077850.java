package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077850 Expansion of (1-x)^(-1)/(1 - 2*x - x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A077850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077850() {
    super(new long[] {1, -2, -1, 3}, new long[] {1, 3, 8, 19});
  }
}
