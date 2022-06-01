package irvine.oeis.a000;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A000963 The convergent sequence B_n for the ternary continued fraction (3,1;2,2) of period 2.
 * @author Sean A. Irvine
 */
public class A000963 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000963() {
    super(new long[] {0, 1, 0, -4, 7, -2},
      new long[] {1, 0, -7, 0, 3, 0, -1});
  }
}
