package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199803 G.f.: 1/(1 + x - x^2 - x^3 + x^4).
 * @author Sean A. Irvine
 */
public class A199803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199803() {
    super(new long[] {-1, 1, 1, -1}, new long[] {1, -1, 2, -2});
  }
}
