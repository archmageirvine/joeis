package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027930 a(n) = T(n, 2*n-7), T given by A027926.
 * @author Sean A. Irvine
 */
public class A027930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027930() {
    super(4, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 3, 8, 21, 54, 133, 309, 674});
  }
}
