package irvine.oeis.a063;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A063373 Dimension of the space of weight n cuspidal newforms for Gamma_1( 100 ).
 * @author Georg Fischer
 */
public class A063373 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A063373() {
    super(2, new long[] {0, 0, -1, 141, 302, 463, 626, 645, 647, 503, 344, 181, 20},
      new long[] {1, 0, 0, 0, -1, 0, -1, 0, 0, 0, 1});
  }
}
