package irvine.oeis.a289;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A289927 p-INVERT of A014217 (starting at n=1), where p(S) = 1 - S - S^2.
 * @author Georg Fischer
 */
public class A289927 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A289927() {
    super(0, new long[] {1, 1, -1, -1, 1, 1, -1},
      new long[] {1, -3, -4, 7, 5, -7, -4, 3, 1});
  }
}
