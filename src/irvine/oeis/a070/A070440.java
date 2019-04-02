package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070440 a(n) = n^2 mod 18.
 * @author Sean A. Irvine
 */
public class A070440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070440() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 16, 7, 0, 13, 10, 9, 10, 13, 0, 7, 16, 9, 4, 1});
  }
}
