package irvine.oeis.a389;

import irvine.oeis.a385.A385573;

/**
 * A389575 Decreasing partition array based on the tails of the Champernowne constant (A033307); see Comments.
 * @author Sean A. Irvine
 */
public class A389575 extends A385573 {

  /** Construct the sequence. */
  public A389575() {
    super(A389574::champerknowneShiftedFrac);
  }
}

