package irvine.oeis.a389;

import irvine.oeis.a385.A385573;

/**
 * A389577 Decreasing partition array based on the tails of the binary Champernowne constant (A030190); see Comments.
 * @author Sean A. Irvine
 */
public class A389577 extends A385573 {

  /** Construct the sequence. */
  public A389577() {
    super(A389576::champerknowneBase2ShiftedFrac);
  }
}

