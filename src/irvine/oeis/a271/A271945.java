package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271945 Expansion of 4*x^2/(1 - x - 9*x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A271945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271945() {
    super(new long[] {-1, 9, 1}, new long[] {0, 0, 4});
  }
}
