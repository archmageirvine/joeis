package irvine.oeis.a264;

import irvine.oeis.a002.A002275;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A264934 Decimal expansion of number with continued fraction expansion 0, 1, 11, 111, 1111, 11111 ... (the repunits).
 * @author Sean A. Irvine
 */
public class A264934 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A264934() {
    super(0, new A002275());
  }
}
