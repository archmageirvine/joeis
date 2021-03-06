package irvine.oeis.a267;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A267622 Binary representation of the n-th iteration of the "Rule 187" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267622 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A267622() {
    super(0, new long[] {1, 0, 10},
      new long[] {1, -101, 100});
  }
}
