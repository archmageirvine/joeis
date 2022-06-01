package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077947 Expansion of 1/(1 - x - x^2 - 2*x^3).
 * @author Sean A. Irvine
 */
public class A077947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077947() {
    super(new long[] {2, 1, 1}, new long[] {1, 1, 2});
  }
}
