package irvine.oeis.a038;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A038733 T(n,n-4), array T as in A038730.
 * @author Georg Fischer
 */
public class A038733 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A038733() {
    super(4, new long[] {0, 0, 0, 0, 1},
      new long[] {1, -10, 43, -105, 161, -161, 105, -43, 10, -1});
  }
}
