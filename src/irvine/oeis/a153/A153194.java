package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153194 Numbers such that the numerator of floor(sqrt(n))/n, when reduced to its lowest terms, is equal to 3.
 * @author Sean A. Irvine
 */
public class A153194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153194() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {10, 11, 13, 14, 38, 40, 44, 46, 84});
  }
}
