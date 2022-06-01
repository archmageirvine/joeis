package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271391 Expansion of (1 + x + 2*x^2 + 6*x^3 + x^4 + x^5)/(1 - x^2)^3.
 * @author Sean A. Irvine
 */
public class A271391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271391() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 1, 5, 9, 13, 25});
  }
}
