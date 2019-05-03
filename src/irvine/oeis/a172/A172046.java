package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172046 Partial sums of <code>floor(n^2/7) (A056834)</code>.
 * @author Sean A. Irvine
 */
public class A172046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172046() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 3, 6, 11, 18, 27, 38});
  }
}
