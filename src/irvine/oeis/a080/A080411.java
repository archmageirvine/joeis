package irvine.oeis.a080;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A080411 Decimal expansion of the number which results when the Boustrophedon transform of the continued fraction of gamma (A080410) is interpreted as a continued fraction.
 * @author Sean A. Irvine
 */
public class A080411 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A080411() {
    super(0, new A080410());
  }
}
