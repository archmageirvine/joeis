package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A294725 Number of permutations of [n] avoiding {4231, 3412, 1234}.
 * @author Georg Fischer
 */
public class A294725 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294725() {
    super(0, new long[] {1, -6, 16, -22, 21, -6, 2},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
