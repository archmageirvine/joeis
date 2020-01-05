package irvine.oeis.a028;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A028345 Molien series for complete weight enumerator of self-dual code over <code>GF(5)</code> containing <code>all-1</code>'s vector.
 * @author Sean A. Irvine
 */
public class A028345 extends GeneratingFunctionSequence {

  /**
   * Construct the sequence.
   */
  public A028345() {
    super(new long[] {-1, 1, -4, -9, -9, -19, -15, -2, -2},
      new long[] {-1, 2, 0, 0, -3, 0, 3, 0, 0, -2, 1});
  }
}
