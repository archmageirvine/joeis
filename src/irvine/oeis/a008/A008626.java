package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008626.
 * @author Sean A. Irvine
 */
public class A008626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008626() {
    super(new long[] {-1, 2, -3, 4, -4, 4, -4, 4, -4, 4, -4, 4, -4, 4, -4, 4, -3, 2},
      new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 2, 1, 0, 0, 2, 2, 0});
  }
}

