package irvine.oeis.a266;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A266613 Decimal representation of the middle column of the "Rule 41" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A266613 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266613() {
    super(0, new long[] {1, 0, 0, 0, -1, 1},
      new long[] {1, -2, -1, 2});
  }
}
