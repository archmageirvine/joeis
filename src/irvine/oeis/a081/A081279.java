package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081279 Binomial transform of Chebyshev coefficients A001794.
 * @author Sean A. Irvine
 */
public class A081279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081279() {
    super(new long[] {-81, 108, -54, 12}, new long[] {1, 8, 47, 238});
  }
}
