package irvine.oeis.a064;

import irvine.oeis.a000.A000040;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A064442 Decimal expansion of number with continued fraction expansion 2, 3, 5, 7, 11, 13, 17, 19, ... = 2.3130367364335829063839516 ...
 * @author Sean A. Irvine
 */
public class A064442 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A064442() {
    super(new A000040());
  }
}
