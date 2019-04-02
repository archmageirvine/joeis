package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077943 Expansion of 1/(1-2*x+2*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077943() {
    super(new long[] {2, -2, 2}, new long[] {1, 2, 2});
  }
}
