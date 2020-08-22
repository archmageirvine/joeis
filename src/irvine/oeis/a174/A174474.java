package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174474 a(n) = (2*n^2 - 2*n - 3)/8 + 3*(-1)^n*(1-2*n)/8.
 * @author Sean A. Irvine
 */
public class A174474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174474() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, -1, 3, 0});
  }
}
