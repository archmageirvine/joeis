package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A294762 Number of permutations of [n] avoiding {4231, 1243, 1234}.
 * @author Georg Fischer
 */
public class A294762 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294762() {
    super(0, new long[] {1, -7, 22, -38, 43, -25, 17, 2, -4},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
