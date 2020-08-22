package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077848 Expansion of (1-x)^(-1)/(1-2*x-x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077848() {
    super(new long[] {-2, 1, -1, 3}, new long[] {1, 3, 8, 22});
  }
}
