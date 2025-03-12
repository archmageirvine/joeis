package irvine.oeis.a079;
// manually 2025-03-08/cfden at 2025-03-12 10:42

import irvine.oeis.a002.A002162;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A079943 Denominators of the convergents of the continued fraction for log(2).
 * @author Georg Fischer
 */
public class A079943 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A079943() {
    super(1, new A002162());
    next();
  }
}
