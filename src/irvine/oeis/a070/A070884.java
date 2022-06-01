package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070884 7 + x where x is congruent to {0, 4, 6, 10, 12, 16, 22, 24} mod 30.
 * @author Sean A. Irvine
 */
public class A070884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070884() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {7, 11, 13, 17, 19, 23, 29, 31, 37});
  }
}
