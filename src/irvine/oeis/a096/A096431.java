package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096431 Denominator of (9*(n^4 - 2*n^3 + 2*n^2 - n) + 2)/(2*(2*n - 1)).
 * @author Sean A. Irvine
 */
public class A096431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096431() {
    super(1, new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {1, 3, 1, 7, 9, 11, 13, 3, 17, 19});
  }
}
