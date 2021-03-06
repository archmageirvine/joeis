package irvine.oeis.a283;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A283353 Decimal representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 619", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A283353 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A283353() {
    super(0, new long[] {1, 0, -1, 6},
      new long[] {1, -2, -1, 2});
  }
}
