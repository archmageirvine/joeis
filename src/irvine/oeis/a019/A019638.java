package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019638 Decimal expansion of sqrt(2*Pi*e)/11.
 * @author Sean A. Irvine
 */
public class A019638 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019638() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(11)));
  }
}
