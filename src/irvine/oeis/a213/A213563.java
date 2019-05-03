package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213563 Antidiagonal sums of the convolution array <code>A213561</code>.
 * @author Sean A. Irvine
 */
public class A213563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213563() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 10, 51, 182, 518, 1260, 2730});
  }
}
