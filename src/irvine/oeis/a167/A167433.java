package irvine.oeis.a167;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A167433 Row sums of the Riordan array (1-4x+4x^2, x(1-2x)) (A167431).
 * @author Georg Fischer
 */
public class A167433 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A167433() {
    super(0, new long[] {1, -4, 4},
      new long[] {1, -1, 2});
  }
}
