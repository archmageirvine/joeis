package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266302 Decimal representation of the n-th iteration of the "Rule 15" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266302 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266302() {
    super(new long[] {-16, 0, 17, 0}, new long[] {1, 6, 1, 126});
  }
}
