package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267775 Binary representation of the n-th iteration of the "Rule 207" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267775 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267775() {
    super(0, new long[] {1, -1, 1, -100},
      new long[] {1, -111, 1110, -1000});
  }
}
