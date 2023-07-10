package irvine.oeis.a053;

import irvine.oeis.a003.A003285;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A053011 Decimal expansion of real number whose continued fraction is defined by property that k-th partial quotient is the period length of the continued fraction for sqrt(k).
 * @author Sean A. Irvine
 */
public class A053011 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A053011() {
    super(new A003285());
  }
}
