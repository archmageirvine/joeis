package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265225 Total number of ON (black) cells after n iterations of the "Rule 54" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265225() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 6, 12, 15});
  }
}
