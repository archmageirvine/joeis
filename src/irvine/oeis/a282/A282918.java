package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A282918 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 529", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A282918 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A282918() {
    super(0, new long[] {1, 0, 0, 0, 11, 32, -84, 0, 0, 0, -128},
      new long[] {1, 0, -4, 0, -1, 0, 4});
  }
}
