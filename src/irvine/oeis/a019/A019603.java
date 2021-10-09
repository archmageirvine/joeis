package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019603 Decimal expansion of 2*Pi*e/13.
 * @author Sean A. Irvine
 */
public class A019603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019603() {
    super(CR.TAU.multiply(CR.E).divide(CR.valueOf(13)));
  }
}
