package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038342 G.f.: 1/(1 - 3 x - 3 x^2 + 4 x^3 + x^4 - x^5).
 * @author Sean A. Irvine
 */
public class A038342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038342() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {1, 3, 12, 41, 146});
  }
}
