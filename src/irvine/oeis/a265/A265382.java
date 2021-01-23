package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265382 Total number of ON (black) cells after n iterations of the "Rule 158" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265382 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265382() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 8, 13, 20});
  }
}
