package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266841 Binary representation of the n-th iteration of the "Rule 69" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266841 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266841() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 10, 10100, 101011, 101010000, 1010101111});
  }
}
