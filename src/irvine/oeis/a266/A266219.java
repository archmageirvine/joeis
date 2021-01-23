package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266219 Binary representation of the middle column of the "Rule 7" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266219 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266219() {
    super(new long[] {-10, 1, 10}, new long[] {1, 11, 110});
  }
}
