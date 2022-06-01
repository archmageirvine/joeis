package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100058 Expansion of 1 / (1 - 3x - x^2 + 2x^3).
 * @author Sean A. Irvine
 */
public class A100058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100058() {
    super(new long[] {-2, 1, 3}, new long[] {1, 3, 10});
  }
}
