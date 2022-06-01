package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030441 Values of Newton-Gregory forward interpolating polynomial (1/3)*(2*n - 3)*(2*n^2 - 3*n + 4).
 * @author Sean A. Irvine
 */
public class A030441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030441() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-4, -1, 2, 13});
  }
}
