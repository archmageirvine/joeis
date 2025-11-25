package irvine.oeis.a390;

import irvine.oeis.PrependSequence;
import irvine.oeis.a084.A084580;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A390652 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A390652 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A390652() {
    super(0, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A084580(), 0)));
  }
}
