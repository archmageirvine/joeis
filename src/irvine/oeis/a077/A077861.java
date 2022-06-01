package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077861 Expansion of (1-x)^(-1)/(1-2*x+2*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A077861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077861() {
    super(new long[] {1, 1, -4, 3}, new long[] {1, 3, 5, 4});
  }
}
