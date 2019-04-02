package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070438 a(n) = n^2 mod 15.
 * @author Sean A. Irvine
 */
public class A070438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070438() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 1, 10, 6, 4, 4, 6, 10, 1, 9, 4, 1});
  }
}
