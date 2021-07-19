package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019634 Decimal expansion of sqrt(2*Pi*e)/3.
 * @author Sean A. Irvine
 */
public class A019634 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019634() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.THREE));
  }
}
