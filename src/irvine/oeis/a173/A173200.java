package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173200 Solutions y of the Mordell equation y^2 = x^3 - 3a^2 - 1 for a = 0,1,2, ... (solutions x are given by A053755).
 * @author Sean A. Irvine
 */
public class A173200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173200() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {0, 11, 70, 225});
  }
}
