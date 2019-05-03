package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213547 Antidiagonal sums of the convolution array <code>A213505</code>.
 * @author Sean A. Irvine
 */
public class A213547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213547() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 12, 68, 260, 777, 1960, 4368});
  }
}
