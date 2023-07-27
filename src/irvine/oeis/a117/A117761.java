package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117761 Expansion of x*(1 + x^2 + x^4)/(1 - x - x^3 - x^5 - x^7).
 * @author Sean A. Irvine
 */
public class A117761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117761() {
    super(new long[] {1, 0, 1, 0, 1, 0, 1}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
