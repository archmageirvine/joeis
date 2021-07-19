package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019598 Decimal expansion of 2*Pi*e/3.
 * @author Sean A. Irvine
 */
public class A019598 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019598() {
    super(CR.TAU.multiply(CR.E).divide(CR.THREE));
  }
}
