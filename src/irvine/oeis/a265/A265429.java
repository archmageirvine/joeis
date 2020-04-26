package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265429 Total number of ON (black) cells after n iterations of the "Rule <code>188"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265429 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265429() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 3, 5, 9, 13, 18});
  }
}
