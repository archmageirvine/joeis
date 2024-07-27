package irvine.oeis.a215;

import irvine.oeis.a153.A153496;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A215758 Numerators of the continued fraction convergents of log_10(6).
 * @author Georg Fischer
 */
public class A215758 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence */
  public A215758() {
    super(0, new A153496());
  }
}
