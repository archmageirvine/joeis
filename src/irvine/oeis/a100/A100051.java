package irvine.oeis.a100;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A100051 A Chebyshev transform of 1,1,1,...
 * @author Georg Fischer
 */
public class A100051 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A100051() {
    super(0, new long[] {1, 0, -1},
      new long[] {1, -1, 1});
  }
}
