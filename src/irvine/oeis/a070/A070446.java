package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070446 a(n) = n^2 mod 24.
 * @author Sean A. Irvine
 */
public class A070446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070446() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 16, 1, 12, 1, 16, 9, 4, 1});
  }
}
