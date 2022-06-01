package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077260 Triangular numbers that are 1/5 of a triangular number.
 * @author Sean A. Irvine
 */
public class A077260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077260() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {0, 3, 21, 990, 6786});
  }
}
