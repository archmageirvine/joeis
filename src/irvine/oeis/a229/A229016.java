package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A229016 Number of arrays of median of three adjacent elements of some length 8 0..n array, with no adjacent equal elements in the latter.
 * @author Georg Fischer
 */
public class A229016 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A229016() {
    super(1, new long[] {0, 2, 91, 137, -148, -4, 9, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
