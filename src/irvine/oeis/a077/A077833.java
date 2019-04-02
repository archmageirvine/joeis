package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077833 Expansion of 1/(1-2*x-3*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077833() {
    super(new long[] {2, 3, 2}, new long[] {1, 2, 7});
  }
}
