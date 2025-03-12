package irvine.oeis.a096;
// manually 2025-03-08/cfden at 2025-03-12 10:42

import irvine.oeis.a019.A019669;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A096463 Denominators of convergents to Pi/2.
 * @author Georg Fischer
 */
public class A096463 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A096463() {
    super(1, new A019669());
    next();
  }
}
