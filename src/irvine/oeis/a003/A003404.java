package irvine.oeis.a003;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A003404 Number of solid partitions of n supported on graph of cube.
 * @author Sean A. Irvine
 */
public class A003404 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A003404() {
    super(new long[] {1, 0, 2, 2, 3, 3, 5, 4, 8, 4, 5, 3, 3, 2, 2, 0, 1},
      new long[] {1, -1, -1, 0, 0, 1, 0, 1, 0, 1, 0, -1, -2, -1, 0, -1, 1, 1, 2, 1, 1, -1, 0, -1, -2, -1, 0, 1, 0, 1, 0, 1, 0, 0, -1, -1, 1});
  }
}
