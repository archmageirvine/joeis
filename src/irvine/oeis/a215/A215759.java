package irvine.oeis.a215;

import irvine.oeis.a153.A153620;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A215759 Numerators of the continued fraction convergents of log_10(7).
 * @author Georg Fischer
 */
public class A215759 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence */
  public A215759() {
    super(0, new A153620());
  }
}
