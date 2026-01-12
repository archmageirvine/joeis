package irvine.oeis.a392;

import irvine.oeis.PrependSequence;
import irvine.oeis.a391.A391217;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A392259 Denominators of the convergents given by treating A391217 as continued fraction coefficients after the leading 0.
 * @author Sean A. Irvine
 */
public class A392259 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A392259() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A391217(), 0)));
    next();
  }
}
