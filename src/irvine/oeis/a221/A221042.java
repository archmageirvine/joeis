package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221042 The Wiener index of the Bethe cactus lattice graph D_n defined pictorially in the Hosoya - Balasubramanian reference.
 * @author Georg Fischer
 */
public class A221042 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A221042() {
    super(1, new long[] {0, 8, 12, 108},
      new long[] {1, -25, 222, -846, 1377, -729});
  }
}
