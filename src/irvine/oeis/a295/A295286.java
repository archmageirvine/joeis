package irvine.oeis.a295;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A295286 Sum of the products of the smaller and larger parts of the partitions of n into two parts with the smaller part odd.
 * @author Georg Fischer
 */
public class A295286 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A295286() {
    super(1, new long[] {0, 0, 1, 1, 1, 1, 7, 1, 1, 1, 2}, new long[] {1, -1, 0, 0, -3, 3, 0, 0, 3, -3, 0, 0, -1, 1});
  }
}
