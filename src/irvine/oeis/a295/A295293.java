package irvine.oeis.a295;
// manually verified, 2023-04-29

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A295293 Sum of the products of the smaller and larger parts of the partitions of n into two parts with the larger part even.
 * @author Georg Fischer
 */
public class A295293 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A295293() {
    super(1, new long[] {0, 0, 0, 2, 2, 0, 4, 4, 4, -2, 2}, new long[] {1, -1, 0, 0, -3, 3, 0, 0, 3, -3, 0, 0, -1, 1});
  }
}
