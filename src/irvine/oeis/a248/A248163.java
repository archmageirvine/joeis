package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248163 Chebyshev's S polynomials (A049310) evaluated at 34/3 and multiplied by powers of 3 (A000244).
 * @author Sean A. Irvine
 */
public class A248163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248163() {
    super(new long[] {-9, 34}, new long[] {1, 34});
  }
}
