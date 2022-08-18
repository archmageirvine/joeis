package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019709 Decimal expansion of sqrt(Pi)/7.
 * @author Sean A. Irvine
 */
public class A019709 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019709() {
    super(0, CR.SQRT_PI.divide(CR.SEVEN));
  }
}
