package irvine.oeis.a390;

import irvine.oeis.PrependSequence;
import irvine.oeis.a084.A084580;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A390651 Numerators of the convergents given by treating A084580 as continued fraction coefficients after the leading 0.
 * @author Sean A. Irvine
 */
public class A390651 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A390651() {
    super(0, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A084580(), 0)));
  }
}
