package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019708 Decimal expansion of sqrt(Pi)/6.
 * @author Sean A. Irvine
 */
public class A019708 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019708() {
    super(0, CR.SQRT_PI.divide(CR.SIX));
  }
}
