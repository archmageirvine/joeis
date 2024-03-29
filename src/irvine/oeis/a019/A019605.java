package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019605 Decimal expansion of 2*Pi*e/17.
 * @author Sean A. Irvine
 */
public class A019605 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019605() {
    super(CR.TAU.multiply(CR.E).divide(CR.valueOf(17)));
  }
}
