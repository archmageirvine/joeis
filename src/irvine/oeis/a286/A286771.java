package irvine.oeis.a286;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A286771 Binary representation of the diagonal from the origin to the corner of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 221", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A286771 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A286771() {
    super(0, new long[] {1, 1, -101, 10, 10100, 0, -10000},
      new long[] {1, 0, -101, 0, 100});
  }
}
