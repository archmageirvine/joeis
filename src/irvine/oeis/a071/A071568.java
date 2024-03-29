package irvine.oeis.a071;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A071568 Smallest k&gt;n such that n^3+1 divides k*n^2+1.
 * @author Georg Fischer
 */
public class A071568 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A071568() {
    super(0, new long[] {1, -1, 5, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
