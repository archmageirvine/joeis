package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070442 a(n) = n^2 mod 20.
 * @author Sean A. Irvine
 */
public class A070442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070442() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 16, 5, 16, 9, 4, 1});
  }
}
