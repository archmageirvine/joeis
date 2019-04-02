package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266438 Total number of ON (black) cells after n iterations of the "Rule 23" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266438() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 4, 11, 11});
  }
}
