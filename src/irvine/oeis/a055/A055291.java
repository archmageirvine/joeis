package irvine.oeis.a055;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A055291 Number of trees with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055291 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A055291() {
    super(5, new long[] {0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
      new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2, -1});
  }
}
