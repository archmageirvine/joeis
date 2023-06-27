package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181689 Number of maximal self-avoiding walks from NW to SW corners of a 5 X n grid.
 * @author Sean A. Irvine
 */
public class A181689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181689() {
    super(1, new long[] {2, 0, 0, 0, 11, 0}, new long[] {1, 0, 8, 0, 86, 0});
  }
}
