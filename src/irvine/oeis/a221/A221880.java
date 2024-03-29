package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221880 Number of order-preserving or order-reversing full contraction mappings (of an n-chain) with exactly 1 fixed point.
 * @author Georg Fischer
 */
public class A221880 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A221880() {
    super(1, new long[] {0, 1, -3, 5, -3, -3, 1},
      new long[] {1, -5, 7, 1, -8, 4});
  }
}
