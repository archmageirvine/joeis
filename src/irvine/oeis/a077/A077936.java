package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077936 Expansion of 1/(1 - 2*x - 2*x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A077936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077936() {
    super(new long[] {1, 2, 2}, new long[] {1, 2, 6});
  }
}
