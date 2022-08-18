package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019653 Decimal expansion of sqrt(Pi*e)/9.
 * @author Sean A. Irvine
 */
public class A019653 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019653() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.NINE));
  }
}
