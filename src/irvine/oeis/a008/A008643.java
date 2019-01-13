package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008643.
 * @author Sean A. Irvine
 */
public class A008643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008643() {
    super(new long[] {-1, 1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1},
      new long[] {1, 1, 2, 2, 4, 4, 6, 6, 10, 10, 14, 14, 20, 20, 26});
  }
}

