package irvine.oeis.a294;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A294709 Number of permutations of [n] avoiding {2143, 3412, 1234}.
 * @author Georg Fischer
 */
public class A294709 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A294709() {
    super(0, new long[] {1, -5, 11, -11, 10, 2},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
