package irvine.oeis.a001;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A001993 Number of two-rowed partitions of length 3.
 * @author Sean A. Irvine
 */
public class A001993 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A001993() {
    super(new long[] {1}, new long[] {1, -1, -2, 0, 2, 4, -1, -3, -3, -1, 4, 2, 0, -2, -1, 1});
  }
}
