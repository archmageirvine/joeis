package irvine.oeis.a372;

import irvine.oeis.a084.A084580;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A372869 Decimal expansion of the number whose continued fraction coefficients are given in A084580.
 * @author Sean A. Irvine
 */
public class A372869 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A372869() {
    super(0, new A084580().prepend(0));
  }
}

