package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077984 Expansion of 1/(1+2*x-2*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A077984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077984() {
    super(new long[] {-2, 2, -2}, new long[] {1, -2, 6});
  }
}
