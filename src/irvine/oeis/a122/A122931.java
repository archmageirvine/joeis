package irvine.oeis.a122;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A122931 Row sums of triangular array A122930.
 * @author Georg Fischer
 */
public class A122931 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A122931() {
    super(1, new long[] {0, 1, -1},
      new long[] {1, -3, -1, 5, 1, -1});
  }
}
