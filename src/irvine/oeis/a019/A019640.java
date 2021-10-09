package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019640 Decimal expansion of sqrt(2*Pi*e)/15.
 * @author Sean A. Irvine
 */
public class A019640 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019640() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(15)));
  }
}
