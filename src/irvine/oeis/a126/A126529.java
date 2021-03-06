package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A126529 Number of base 8 n-digit numbers with adjacent digits differing by five or less.
 * @author Georg Fischer
 */
public class A126529 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A126529() {
    super(0, new long[] {1, 1, -1},
      new long[] {1, -7, -3, 4});
  }
}
