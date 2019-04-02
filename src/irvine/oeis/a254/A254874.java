package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254874 a(n) = floor((10*n^3 + 63*n^2 + 126*n + 89) / 72).
 * @author Sean A. Irvine
 */
public class A254874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254874() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {1, 4, 9, 18, 31, 49, 73});
  }
}
