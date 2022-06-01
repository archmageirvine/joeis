package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213749 Antidiagonal sums of the convolution array A213747.
 * @author Sean A. Irvine
 */
public class A213749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213749() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {1, 9, 46, 180, 603, 1827});
  }
}
