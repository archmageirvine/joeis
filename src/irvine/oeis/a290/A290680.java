package irvine.oeis.a290;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A290680 Binary representation of the diagonal from the corner to the origin of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 929", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A290680 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A290680() {
    super(0, new long[] {1, -1, 11, -11, 11, -10},
      new long[] {1, -11, 10});
  }
}
