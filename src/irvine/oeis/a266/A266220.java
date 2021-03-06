package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266220 Number of ON (black) cells in the n-th iteration of the "Rule 7" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A266220 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266220() {
    super(0, new long[] {1, 2, -2, 3, 1, -1},
      new long[] {1, 0, -2, 0, 1});
  }
}
