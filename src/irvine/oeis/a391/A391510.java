package irvine.oeis.a391;

import irvine.oeis.PrependSequence;
import irvine.oeis.a241.A241773;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A391510 Denominators of the convergents given by treating A241773 as continued fraction coefficients after the leading 0.
 * @author Sean A. Irvine
 */
public class A391510 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A391510() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A241773(), 0)));
    next();
  }
}
