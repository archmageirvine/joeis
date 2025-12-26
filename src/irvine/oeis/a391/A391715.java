package irvine.oeis.a391;

import irvine.oeis.PrependSequence;
import irvine.oeis.a072.A072193;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A391715 Denominators of the convergents given by treating A072193 as continued fraction coefficients after the leading 0.
 * @author Sean A. Irvine
 */
public class A391715 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A391715() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A072193(), 0)));
    next();
  }
}
