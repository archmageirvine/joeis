package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100305 Expansion of (1 - x - 4*x^2)/(1 - 2*x - 7*x^2 + 8*x^3).
 * @author Sean A. Irvine
 */
public class A100305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100305() {
    super(new long[] {-8, 7, 2}, new long[] {1, 1, 5});
  }
}
