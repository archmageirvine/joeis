package irvine.oeis.a065;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A065164 Permutation t-&gt;t+1 of Z, folded to N.
 * @author Georg Fischer
 */
public class A065164 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A065164() {
    super(1, new long[] {0, 2, 2, -5, 3},
      new long[] {1, -1, -1, 1});
  }
}
