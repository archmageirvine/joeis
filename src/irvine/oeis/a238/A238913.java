package irvine.oeis.a238;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A238913 Number of self-inverse permutations p on [n] where the maximal displacement of an element equals 2.
 * @author Georg Fischer
 */
public class A238913 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A238913() {
    super(0, new long[] {0, 0, 0, 1, 1},
      new long[] {1, -2, -1, 1, 1, 2, 1});
  }
}
