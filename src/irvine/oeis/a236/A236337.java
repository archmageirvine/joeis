package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236337 Expansion of <code>(2 - x) / ((1 - x)^2 * (1 - x^3))</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A236337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236337() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {2, 3, 4, 7, 9});
  }
}
