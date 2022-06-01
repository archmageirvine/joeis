package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213843 Antidiagonal sums of the convolution array A213841.
 * @author Sean A. Irvine
 */
public class A213843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213843() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 13, 62, 190, 455});
  }
}
