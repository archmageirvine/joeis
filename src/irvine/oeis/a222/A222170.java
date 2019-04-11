package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222170 <code>a(n) = n^2 + 2*floor(n^2/3)</code>.
 * @author Sean A. Irvine
 */
public class A222170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222170() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 6, 15, 26});
  }
}
