package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213570 Antidiagonal sums of the convolution array A213566.
 * @author Sean A. Irvine
 */
public class A213570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213570() {
    super(1, new long[] {1, -3, 1, 6, -9, 5}, new long[] {1, 9, 37, 110, 272, 598});
  }
}
