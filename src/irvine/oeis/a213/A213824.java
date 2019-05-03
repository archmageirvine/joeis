package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213824 Antidiagonal sums of the convolution array <code>A213822</code>.
 * @author Sean A. Irvine
 */
public class A213824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213824() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {4, 30, 114, 310, 690});
  }
}
