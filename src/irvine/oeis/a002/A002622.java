package irvine.oeis.a002;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A002622 Number of partitions of at most n into at most 5 parts.
 * @author Sean A. Irvine
 */
public class A002622 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A002622() {
    super(new long[] {1}, new long[] {1, -2, 0, 1, 0, 1, 0, 0, -2, 0, 0, 1, 0, 1, 0, -2, 1});
  }
}
