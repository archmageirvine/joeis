package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266671 Decimal representation of the n-th iteration of the "Rule 53" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266671 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266671() {
    super(new long[] {128, 0, -152, 0, 25, 0}, new long[] {1, 3, 8, 95, 64, 1791});
  }
}
