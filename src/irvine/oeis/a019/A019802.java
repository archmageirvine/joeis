package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019802 Decimal expansion of sqrt(2*e)/9.
 * @author Sean A. Irvine
 */
public class A019802 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019802() {
    super(0, CR.E.multiply(CR.TWO).sqrt().divide(CR.NINE));
  }
}
