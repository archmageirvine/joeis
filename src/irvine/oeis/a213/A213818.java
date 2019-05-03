package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213818 Antidiagonal sums of the convolution array <code>A213773</code>.
 * @author Sean A. Irvine
 */
public class A213818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213818() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 12, 60, 190, 465});
  }
}
