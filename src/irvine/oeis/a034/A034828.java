package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034828 a(n) = floor(n^2/4)*(n/2).
 * @author Sean A. Irvine
 */
public class A034828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034828() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 1, 3, 8, 15});
  }
}
