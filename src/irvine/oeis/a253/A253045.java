package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253045 a(n) = 8*n^3 - 449*n^2 + 7967*n - 45523.
 * @author Sean A. Irvine
 */
public class A253045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253045() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-45523, -37997, -31321, -25447});
  }
}
