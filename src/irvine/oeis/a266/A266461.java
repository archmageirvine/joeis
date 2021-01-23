package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266461 Decimal representation of the n-th iteration of the "Rule 27" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266461 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266461() {
    super(new long[] {32, 0, -50, 0, 19, 0}, new long[] {1, 5, 2, 123, 4, 2039});
  }
}
