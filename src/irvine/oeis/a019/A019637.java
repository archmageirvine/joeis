package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019637 Decimal expansion of sqrt(2*Pi*e)/9.
 * @author Sean A. Irvine
 */
public class A019637 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019637() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.NINE));
  }
}
