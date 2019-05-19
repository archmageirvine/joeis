package irvine.oeis.a000;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A000971 Fermat coefficients.
 * @author Sean A. Irvine
 */
public class A000971 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000971() {
    super(new long[] {1, 3, 3, -4, 10, -4, 3, 3, 1},
      new long[] {1, -6, 15, -19, 9, 9, -18, 9, 9, -19, 15, -6, 1});
  }
}
