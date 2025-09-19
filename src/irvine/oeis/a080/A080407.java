package irvine.oeis.a080;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A080407 Decimal expansion of the number which results when the Boustrophedon transform of the continued fraction of Pi (A080406, A001203) is interpreted as a continued fraction.
 * @author Sean A. Irvine
 */
public class A080407 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A080407() {
    super(1, new A080406());
  }
}
