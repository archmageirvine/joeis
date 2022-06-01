package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271944 Expansion of 2*x*(1 + x)/(1 - x - 9*x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A271944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271944() {
    super(new long[] {-1, 9, 1}, new long[] {0, 2, 4});
  }
}
