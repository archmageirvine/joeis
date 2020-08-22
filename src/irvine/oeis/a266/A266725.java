package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266725 Total number of OFF (white) cells after n iterations of the "Rule 59" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266725 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266725() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 5, 12});
  }
}
