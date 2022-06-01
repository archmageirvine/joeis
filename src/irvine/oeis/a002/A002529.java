package irvine.oeis.a002;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A002529 a(n) = A002527(n+1) - A002527(n) - A002526(n).
 * @author Sean A. Irvine
 */
public class A002529 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A002529() {
    super(new long[] {0, 0, -2, -2, -2, 2, 2},
      new long[] {-1, 2, 2, 0, 10, 8, -2, -16, -10, -2, 4, 2, 0, 2, 1});
  }
}
