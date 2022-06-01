package irvine.oeis.a001;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A001402 Number of partitions of n into at most 6 parts.
 * @author Sean A. Irvine
 */
public class A001402 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A001402() {
    super(new long[] {1},
      new long[] {1, -1, -1, 0, 0, 1, 0, 2, 0, -1, -1, -1, -1, 0, 2, 0, 1, 0, 0, -1, -1, 1});
  }
}
