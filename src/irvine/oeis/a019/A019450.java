package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019450 Conjectured formula for irreducible 5-fold Euler sums of weight 2n+13.
 * @author Sean A. Irvine
 */
public class A019450 extends CoordinationSequence {

  // Conjectural

  /** Construct the sequence. */
  public A019450() {
    super(
      new long[] {1, 2, 3, 3, 2},
      new int[] {2, 2, 3, 3, 5});
  }
}
