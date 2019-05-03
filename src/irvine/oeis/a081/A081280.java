package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081280 Binomial transform of Chebyshev coefficients <code>A006974</code>.
 * @author Sean A. Irvine
 */
public class A081280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081280() {
    super(new long[] {243, -405, 270, -90, 15}, new long[] {1, 10, 69, 398, 2057});
  }
}
