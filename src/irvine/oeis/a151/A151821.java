package irvine.oeis.a151;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A151821 Powers of 2, omitting 2 itself.
 * @author Georg Fischer
 */
public class A151821 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A151821() {
    super(1, new long[] {0, 1, 2},
      new long[] {1, -2});
  }
}
