package irvine.oeis.a181;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A181298 The number of even entries in all the 2-compositions of n. A 2-composition of n is a nonnegative matrix with two rows, such that each column has at least one nonzero entry and whose entries sum up to n.
 * @author Georg Fischer
 */
public class A181298 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A181298() {
    super(0, new long[] {0, 2, -2, -4, 6, -2},
      new long[] {1, -7, 12, 4, -12, 4});
  }
}
