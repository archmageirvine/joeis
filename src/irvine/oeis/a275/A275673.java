package irvine.oeis.a275;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A275673 List of numbers that are in a spoke of a hexagonal spiral.
 * @author Georg Fischer
 */
public class A275673 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A275673() {
    super(1, new long[] {0, 1, 0, 0, 0, 0, 0, -1, 1},
      new long[] {1, -2, 1, 0, 0, 0, -1, 2, -1});
  }
}
