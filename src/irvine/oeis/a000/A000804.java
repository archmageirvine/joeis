package irvine.oeis.a000;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A000804 Permanent of a certain cyclic <code>n X n (0,1)</code> matrix.
 * @author Sean A. Irvine
 */
public class A000804 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000804() {
    super(new long[] {-1, 2, 1, -2, -10, -60, 75, 150, 158, 122, -190, -213, -113, -48, 64, 41},
      new long[] {-1, 3, 0, -2, -2, -6, 2, 4, 2, 2, -1, -1});
  }
}

