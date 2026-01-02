package irvine.oeis.a391;

import irvine.oeis.PrependSequence;
import irvine.oeis.a390.A390946;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A391907 Denominators of the convergents given by treating A390946 as continued fraction coefficients after the leading 0.
 * @author Sean A. Irvine
 */
public class A391907 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A391907() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A390946(), 0)));
    next();
  }
}
