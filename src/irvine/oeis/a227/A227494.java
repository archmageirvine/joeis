package irvine.oeis.a227;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A227494 The Wiener index of the nanostar dendrimer D_n, defined pictorially as NS[n] in the Yang et al. reference.
 * @author Georg Fischer
 */
public class A227494 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A227494() {
    super(0, new long[] {1437, 234, 16872, 1728, 24576},
      new long[] {1, -13, 64, -148, 160, -64});
  }
}
