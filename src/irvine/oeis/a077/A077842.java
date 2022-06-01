package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077842 Expansion of (1-x)/(1-2*x-2*x^2-3*x^3).
 * @author Sean A. Irvine
 */
public class A077842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077842() {
    super(new long[] {3, 2, 2}, new long[] {1, 1, 4});
  }
}
