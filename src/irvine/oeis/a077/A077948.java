package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077948 Expansion of 1/(1-x-x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A077948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077948() {
    super(new long[] {-2, 1, 1}, new long[] {1, 1, 2});
  }
}
