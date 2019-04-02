package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267212 Total number of ON (black) cells after n iterations of the "Rule 109" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A267212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267212() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 2, 7, 9, 16, 23, 33, 38});
  }
}
