package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077840 Expansion of (1-x)/(1-2*x-3*x^2-3*x^3).
 * @author Sean A. Irvine
 */
public class A077840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077840() {
    super(new long[] {3, 3, 2}, new long[] {1, 1, 5});
  }
}
