package irvine.oeis.a001;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A001584 A generalized Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A001584 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A001584() {
    super(new long[] {1, 1, 1, -1, -1, -1}, new long[] {1, 0, 0, -2, 0, 0, 1, 0, -1});
  }
}
