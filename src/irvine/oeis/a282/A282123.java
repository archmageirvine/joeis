package irvine.oeis.a282;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A282123 Decimal representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 430", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A282123 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A282123() {
    super(0, new long[] {1, 3, 1},
      new long[] {1, 0, -5, 0, 4});
  }
}
