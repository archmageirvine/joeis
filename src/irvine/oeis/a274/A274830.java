package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274830 Numbers n such that 7*n+1 is a triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A274830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274830() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 5, 11, 17});
  }
}
