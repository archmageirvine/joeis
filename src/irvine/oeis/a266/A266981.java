package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266981 Number of ON (black) cells in the n-th iteration of the "Rule 79" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266981() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 2, 5});
  }
}
