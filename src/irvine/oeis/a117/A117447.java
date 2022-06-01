package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117447 Expansion of (1 + 2*x + 3*x^2 + x^3)/(1 + x - x^3 - x^4).
 * @author Sean A. Irvine
 */
public class A117447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117447() {
    super(new long[] {1, 1, 0, -1}, new long[] {1, 1, 2, 0});
  }
}
