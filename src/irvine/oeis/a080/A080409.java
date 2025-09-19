package irvine.oeis.a080;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A080409 Decimal expansion of the number which results when the Boustrophedon transform of the continued fraction of e (A080408, A003417) is interpreted as a continued fraction.
 * @author Sean A. Irvine
 */
public class A080409 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A080409() {
    super(1, new A080408());
  }
}
