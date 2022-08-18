package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019606 Decimal expansion of 2*Pi*e/19.
 * @author Sean A. Irvine
 */
public class A019606 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019606() {
    super(0, CR.TAU.multiply(CR.E).divide(CR.valueOf(19)));
  }
}
