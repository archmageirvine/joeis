package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019720 Decimal expansion of sqrt(Pi)/18.
 * @author Sean A. Irvine
 */
public class A019720 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019720() {
    super(0, CR.SQRT_PI.divide(CR.valueOf(18)));
  }
}
