package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019608 Decimal expansion of 2*Pi*e/23.
 * @author Sean A. Irvine
 */
public class A019608 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019608() {
    super(CR.TAU.multiply(CR.E).divide(CR.valueOf(23)));
  }
}
