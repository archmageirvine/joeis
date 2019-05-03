package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213776 Antidiagonal sums of the convolution array <code>A213774</code>.
 * @author Sean A. Irvine
 */
public class A213776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213776() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 8, 30, 81, 184});
  }
}
