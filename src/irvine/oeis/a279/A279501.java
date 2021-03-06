package irvine.oeis.a279;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A279501 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 161", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A279501 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A279501() {
    super(0, new long[] {1, 0, 1, 0, 8, 0, -24, 0, 0, 0, -128},
      new long[] {1, 0, -4, 0, -1, 0, 4});
  }
}
