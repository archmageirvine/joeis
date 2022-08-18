package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019650 Decimal expansion of sqrt(Pi*e)/6.
 * @author Sean A. Irvine
 */
public class A019650 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019650() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.SIX));
  }
}
