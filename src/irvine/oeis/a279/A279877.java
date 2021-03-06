package irvine.oeis.a279;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A279877 Binary representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 213", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A279877 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A279877() {
    super(0, new long[] {1, 10, -101, -10, 111, 0, -1110, 0, 1000},
      new long[] {1, 0, -111, 0, 1110, 0, -1000});
  }
}
