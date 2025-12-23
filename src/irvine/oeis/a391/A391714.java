package irvine.oeis.a391;

import irvine.oeis.PrependSequence;
import irvine.oeis.a072.A072193;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A391714 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A391714 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A391714() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A072193(), 0)));
    next();
  }
}
