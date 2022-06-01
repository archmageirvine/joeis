package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077886 Expansion of (1-x)^(-1)/(1+2*x^3).
 * @author Sean A. Irvine
 */
public class A077886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077886() {
    super(new long[] {2, -2, 0, 1}, new long[] {1, 1, 1, -1});
  }
}
