package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019636 Decimal expansion of sqrt(2*Pi*e)/7.
 * @author Sean A. Irvine
 */
public class A019636 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019636() {
    super(0, CR.TAU.multiply(CR.E).sqrt().divide(CR.SEVEN));
  }
}
