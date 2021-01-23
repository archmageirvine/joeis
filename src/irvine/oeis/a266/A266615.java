package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266615 Total number of ON (black) cells after n iterations of the "Rule 41" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266615 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266615() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {1, 1, 3, 6, 7, 15, 17});
  }
}
