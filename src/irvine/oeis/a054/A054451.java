package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054451 Third column of triangle A054450 (partial row sums of unsigned Chebyshev triangle A049310).
 * @author Sean A. Irvine
 */
public class A054451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054451() {
    super(new long[] {1, 1, -3, -2, 3, 1}, new long[] {1, 1, 4, 5, 12, 17});
  }
}
