package irvine.oeis.a316;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A316459 Expansion of 30*x*(1 + x) / (1 - x)^4.
 * @author Georg Fischer
 */
public class A316459 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A316459() {
    super(1, new long[] {0, 30, 30},
      new long[] {1, -4, 6, -4, 1});
  }
}
