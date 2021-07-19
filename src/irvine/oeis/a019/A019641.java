package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019641 Decimal expansion of sqrt(2*Pi*e)/17.
 * @author Sean A. Irvine
 */
public class A019641 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019641() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(17)));
  }
}
