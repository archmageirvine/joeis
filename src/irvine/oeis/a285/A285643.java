package irvine.oeis.a285;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A285643 Binary representation of the diagonal from the corner to the origin of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 65", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A285643 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A285643() {
    super(0, new long[] {1, 10, -100, 90, 0, 1000, 10, 0, -1000},
      new long[] {1, 0, -101, 0, 100});
  }
}
