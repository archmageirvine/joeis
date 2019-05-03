package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213581 Antidiagonal sums of the convolution array <code>A213571</code>.
 * @author Sean A. Irvine
 */
public class A213581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213581() {
    super(new long[] {-4, 20, -41, 44, -26, 8}, new long[] {1, 8, 36, 124, 367, 988});
  }
}
