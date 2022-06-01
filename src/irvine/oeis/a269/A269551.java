package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269551 Expansion of (3*x^2 + 258*x - 5)/(x^3 - 99*x^2 + 99*x - 1).
 * @author Sean A. Irvine
 */
public class A269551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269551() {
    super(new long[] {1, -99, 99}, new long[] {5, 237, 22965});
  }
}
