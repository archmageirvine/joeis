package irvine.oeis.a295;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A295287 Sum of the products of the smaller and larger parts of the partitions of n into two parts with the smaller part even.
 * @author Georg Fischer
 */
public class A295287 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A295287() {
    super(1, new long[] {0, 0, 0, 0, 4, 2, 2, 2, 6}, new long[] {1, -1, 0, 0, -3, 3, 0, 0, 3, -3, 0, 0, -1, 1});
  }
}
