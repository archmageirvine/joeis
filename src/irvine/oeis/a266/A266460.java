package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266460 Binary representation of the n-th iteration of the "Rule 27" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266460 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266460() {
    super(new long[] {100000, 0, -110010, 0, 10011, 0}, new long[] {1, 101, 10, 1111011, 100, 11111110111L});
  }
}
