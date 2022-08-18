package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019716 Decimal expansion of sqrt(Pi)/14.
 * @author Sean A. Irvine
 */
public class A019716 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019716() {
    super(0, CR.SQRT_PI.divide(CR.valueOf(14)));
  }
}
