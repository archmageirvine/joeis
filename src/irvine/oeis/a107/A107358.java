package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107358.
 * @author Sean A. Irvine
 */
public class A107358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107358() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144});
  }
}
