package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019600 Decimal expansion of 2*Pi*e/7.
 * @author Sean A. Irvine
 */
public class A019600 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019600() {
    super(CR.TAU.multiply(CR.E).divide(CR.SEVEN));
  }
}
