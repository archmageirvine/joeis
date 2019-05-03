package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213830 Antidiagonal sums of the convolution array <code>A213828</code>.
 * @author Sean A. Irvine
 */
public class A213830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213830() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 18, 78, 230, 540});
  }
}
