package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266850 Decimal representation of the n-th iteration of the "Rule 71" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266850 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266850() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 6, 4, 123, 16, 2031});
  }
}
