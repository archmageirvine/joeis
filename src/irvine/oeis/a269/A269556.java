package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269556 Expansion of (-7*x^2 + 148*x - 5)/(x^3 - 99*x^2 + 99*x - 1).
 * @author Sean A. Irvine
 */
public class A269556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269556() {
    super(new long[] {1, -99, 99}, new long[] {5, 347, 33865});
  }
}
