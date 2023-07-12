package irvine.oeis.a019;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A019459 Conjectured formula for irreducible 6-fold Euler sums of weight 2n+16.
 * @author Sean A. Irvine
 */
public class A019459 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019459() {
    super(
      new long[]{1, 2, 3, 4, 6, 6, 6, 7, 4, 5, 4, 2, 2, 0, 0, 0, -1, 1},
      new int[]{1, 2, 3, 4, 6, 9});
    setOffset(1);
  }
}
