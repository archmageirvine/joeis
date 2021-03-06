package irvine.oeis.a280;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A280369 Decimal representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 259", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A280369 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A280369() {
    super(0, new long[] {1, 1, -2, 3, -8, 20},
      new long[] {1, 0, -5, 0, 4});
  }
}
