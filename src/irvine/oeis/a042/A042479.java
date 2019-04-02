package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042479 Denominators of continued fraction convergents to sqrt(767).
 * @author Sean A. Irvine
 */
public class A042479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042479() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 62424, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 10, 13, 23, 36, 59, 95, 344, 783, 1127, 61641, 62768, 187177, 624299, 811476, 1435775, 2247251, 3683026, 5930277, 21473857, 48877991, 70351848});
  }
}
