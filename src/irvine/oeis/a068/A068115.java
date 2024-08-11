package irvine.oeis.a068;

import irvine.oeis.a049.A049470;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A068115 Continued fraction expansion for cos(1).
 * @author Sean A. Irvine
 */
public class A068115 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A068115() {
    super(0, new A049470());
  }
}
