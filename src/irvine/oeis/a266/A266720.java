package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266720 Binary representation of the middle column of the "Rule 59" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A266720 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266720() {
    super(0, new long[] {1, 0, 0, 1, -1},
      new long[] {1, -10, -1, 10});
  }
}
