package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070648 a(n) = n^6 mod 25.
 * @author Sean A. Irvine
 */
public class A070648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070648() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 14, 4, 21, 0, 6, 24, 19, 16, 0, 11, 9, 9, 11, 0, 16, 19, 24, 6, 0, 21, 4, 14, 1});
  }
}
