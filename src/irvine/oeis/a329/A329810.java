package irvine.oeis.a329;

import irvine.oeis.a000.A000225;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A329810 Decimal expansion of the constant whose continued fraction representation is [0; 1, 3, 7, 15, 31, ...] = A000225 (the Mersenne numbers).
 * @author Sean A. Irvine
 */
public class A329810 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A329810() {
    super(0, new A000225());
  }
}
