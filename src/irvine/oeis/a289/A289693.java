package irvine.oeis.a289;
// manually verified, 2023-04-29 (Mathar)

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A289693 The number of partitions of [n] with exactly 3 blocks without peaks.
 * @author Georg Fischer
 */
public class A289693 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A289693() {
    super(1, new long[] {0, 0, 0, 1, -3, 6, -6, 5, -2, 1}, new long[] {1, -6, 15, -24, 29, -25, 17, -9, 3, -1});
  }
}
