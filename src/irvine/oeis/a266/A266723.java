package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266723 Total number of ON (black) cells after n iterations of the "Rule 59" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266723 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266723() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 5, 11, 13});
  }
}
