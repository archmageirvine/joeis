package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081278 Binomial transform of Chebyshev polynomial coefficients A001793.
 * @author Sean A. Irvine
 */
public class A081278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081278() {
    super(new long[] {27, -27, 9}, new long[] {1, 6, 29});
  }
}
