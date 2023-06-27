package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153192 Numbers such that the numerator of floor(sqrt(n))/n, when reduced to its lowest terms, is equal to 2.
 * @author Sean A. Irvine
 */
public class A153192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153192() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {5, 7, 18, 22, 39});
  }
}
