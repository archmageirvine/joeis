package irvine.oeis.a083;

import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A083700 Decimal expansion of the limit of the n-th continued fraction convergent, A083699(n)/A072999(n), which has the least prime denominator.
 * @author Sean A. Irvine
 */
public class A083700 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A083700() {
    super(0, new A083698());
  }
}
