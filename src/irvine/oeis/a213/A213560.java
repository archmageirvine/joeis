package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213560 Antidiagonal sums of the convolution array A213558.
 * @author Sean A. Irvine
 */
public class A213560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213560() {
    super(1, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 24, 236, 1400, 6009, 20608, 59952, 153792, 357225});
  }
}
