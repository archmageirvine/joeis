package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133328 Values of n such that the sum of the 7-gonal number (5*n^2 - 3*n)/2 and the following 7-gonal number is a 7-gonal number.
 * @author Sean A. Irvine
 */
public class A133328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133328() {
    super(1, new long[] {1, -1, -39202, 39202, 1}, new long[] {0, 170, 13622, 6672192, 534017484});
  }
}
