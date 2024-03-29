package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221005 The hyper-Wiener index of the nanostar dendrimer NS[n], defined pictorially in the Wang-Hua reference.
 * @author Georg Fischer
 */
public class A221005 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A221005() {
    super(0, new long[] {4797, -72343, 450880, -1412380, 2406976, -2246848, 868864},
      new long[] {1, -19, 150, -636, 1560, -2208, 1664, -512});
  }
}
