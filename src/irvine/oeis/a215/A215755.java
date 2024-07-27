package irvine.oeis.a215;

import irvine.oeis.a153.A153620;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A215755 Denominators of the continued fraction convergents of log_10(7).
 * @author Georg Fischer
 */
public class A215755 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence */
  public A215755() {
    super(0, new A153620());
  }
}
