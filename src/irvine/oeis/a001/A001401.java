package irvine.oeis.a001;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A001401 Number of partitions of n into at most 5 parts.
 * @author Sean A. Irvine
 */
public class A001401 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A001401() {
    super(new long[] {1},
      new long[] {1, -1, -1, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, 1, 1, -1});
  }
}
