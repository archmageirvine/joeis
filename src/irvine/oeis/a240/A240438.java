package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240438 Greatest minimal difference between numbers of adjacent cells in a regular hexagonal honeycomb of order n with cells numbered from 1 through the total number of cells, the order n corresponding to the number of cells on one side of the honeycomb.
 * @author Sean A. Irvine
 */
public class A240438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240438() {
    super(1, new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 5, 11, 18});
  }
}
