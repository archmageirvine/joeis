package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077892 Expansion of (1-x)^(-1)/(1+2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A077892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077892() {
    super(new long[] {-1, 3, -2, 1}, new long[] {1, 1, -1, 0});
  }
}
