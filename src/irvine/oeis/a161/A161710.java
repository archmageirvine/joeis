package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161710 (-6*n^7 + 154*n^6 - 1533*n^5 + 7525*n^4 - 18879*n^3 + 22561*n^2 - 7302*n + 2520)/2520.
 * @author Sean A. Irvine
 */
public class A161710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161710() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 3, 4, 6, 8, 12, 24});
  }
}
