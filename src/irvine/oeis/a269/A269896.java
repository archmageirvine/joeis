package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269896 Number of n X 2 0..6 arrays with some element plus some horizontally or vertically adjacent neighbor totalling six exactly once.
 * @author Georg Fischer
 */
public class A269896 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269896() {
    super(1, new long[] {0, 7, 406, 7},
      new long[] {1, -62, 961});
  }
}
