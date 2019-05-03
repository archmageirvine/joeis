package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266440 Total number of OFF (white) cells after n iterations of the "Rule <code>23"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266440() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 5, 5, 14});
  }
}
