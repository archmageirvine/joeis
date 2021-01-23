package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276600 Values of n such that n^2 + 6 is a triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A276600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276600() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {0, 2, 3, 7, 15, 20});
  }
}
