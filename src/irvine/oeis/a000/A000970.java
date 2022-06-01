package irvine.oeis.a000;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A000970 Fermat coefficients.
 * @author Sean A. Irvine
 */
public class A000970 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000970() {
    super(new long[] {1, 3, 3, 4, 2, 3},
      new long[] {1, -4, 6, -4, 1, -1, 4, -6, 4, -1});
  }
}
