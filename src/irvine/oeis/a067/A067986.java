package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A067986 Convolution of L(n+1) := A000204(n+1) (Lucas), n&gt;=0, with L(n+8), n&gt;=0.
 * @author Georg Fischer
 */
public class A067986 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067986() {
    super(0, new long[] {47, 123, 58},
      new long[] {1, -2, -1, 2, 1});
  }
}
