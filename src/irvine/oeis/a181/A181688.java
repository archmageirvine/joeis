package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181688 Number of maximal self-avoiding walks from NW to SW corners of a 4-by-n grid.
 * @author Sean A. Irvine
 */
public class A181688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181688() {
    super(1, new long[] {1, -2, 2, 2}, new long[] {1, 1, 4, 8});
  }
}
