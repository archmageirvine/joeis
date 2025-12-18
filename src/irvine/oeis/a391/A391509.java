package irvine.oeis.a391;

import irvine.oeis.PrependSequence;
import irvine.oeis.a241.A241773;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A391509 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A391509 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A391509() {
    super(1, new DecimalExpansionFromContinuedFractionSequence(new PrependSequence(new A241773(), 0)));
    next();
  }
}
