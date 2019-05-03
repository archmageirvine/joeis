package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213760 Antidiagonal sums of the convolution array <code>A213783</code>.
 * @author Sean A. Irvine
 */
public class A213760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213760() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 4, 12, 27, 52, 92, 148, 230});
  }
}
