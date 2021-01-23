package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191413 a(n) = 3*n^2 - 2*n + 7.
 * @author Sean A. Irvine
 */
public class A191413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191413() {
    super(new long[] {1, -3, 3}, new long[] {7, 8, 15});
  }
}
