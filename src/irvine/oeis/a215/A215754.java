package irvine.oeis.a215;

import irvine.oeis.a153.A153496;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A215754 Denominators of the continued fraction convergents of log_10(6).
 * @author Georg Fischer
 */
public class A215754 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence */
  public A215754() {
    super(0, new A153496());
  }
}
