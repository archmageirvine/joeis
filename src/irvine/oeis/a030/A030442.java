package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030442 Values of Newton-Gregory forward interpolating polynomial (1/6)*(4*n^4 - 60*n^3 + 347*n^2 - 927*n + 978).
 * @author Sean A. Irvine
 */
public class A030442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030442() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {163, 57, 16, 4, 1});
  }
}
