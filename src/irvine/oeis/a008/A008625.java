package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008625.
 * @author Sean A. Irvine
 */
public class A008625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008625() {
    super(new long[] {1, -1, 0, -1, 1, 0, 0, -1, 1, 0, 1},
      new long[] {1, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3});
  }
}

