package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019666 Decimal expansion of sqrt(Pi*e)/22.
 * @author Sean A. Irvine
 */
public class A019666 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019666() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(22)));
  }
}
