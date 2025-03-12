package irvine.oeis.a112;
// manually 2025-03-08/prepend at 2025-03-12 10:42

import irvine.math.cr.CR;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A112732 Denominators of the convergents to the continued fraction for log_2(5)/4.
 * @author Georg Fischer
 */
public class A112732 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A112732() {
    super(0, new DecimalExpansionSequence(CR.FIVE.log().divide(CR.TWO.log()).divide(4)));
    next();
  }
}
