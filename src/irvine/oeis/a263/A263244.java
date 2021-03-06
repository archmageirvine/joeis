package irvine.oeis.a263;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A263244 Binary representation of the n-th iteration of the "Rule 155" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A263244 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A263244() {
    super(0, new long[] {1, 100, -90, 1100},
      new long[] {1, -1, -10000, 10000});
  }
}
