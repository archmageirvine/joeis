package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267451 Number of ON (black) cells in the n-th iteration of the "Rule 131" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267451() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {1, 1, 2, 2, 4, 3, 6});
  }
}
