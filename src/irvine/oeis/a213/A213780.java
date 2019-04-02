package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213780 Antidiagonal sums of the convolution array A213778.
 * @author Sean A. Irvine
 */
public class A213780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213780() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 6, 17, 40, 78, 140, 230});
  }
}
