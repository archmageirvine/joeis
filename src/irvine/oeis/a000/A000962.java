package irvine.oeis.a000;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A000962 The convergent sequence A_n for the ternary continued fraction (3,1;2,2) of period 2.
 * @author Sean A. Irvine
 */
public class A000962 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000962() {
    super(new long[] {1, 0, -7, 1, 5, -2},
      new long[] {1, 0, -7, 0, 3, 0, -1});
  }
}
