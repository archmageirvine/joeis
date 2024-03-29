package irvine.oeis.a228;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228571 The backwards antidiagonal sums of triangle A228570.
 * @author Georg Fischer
 */
public class A228571 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A228571() {
    super(0, new long[] {2, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2},
      new long[] {2, 0, -2, 0, -2, -2, 2, 0, 0, 2, -2, 0, 2, 0, 0, 2});
  }
}
