package irvine.oeis.a389;

import irvine.oeis.a385.A385573;

/**
 * A389575 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A389575 extends A385573 {

  /** Construct the sequence. */
  public A389575() {
    super(A389574::champerknowneShiftedFrac);
  }
}

