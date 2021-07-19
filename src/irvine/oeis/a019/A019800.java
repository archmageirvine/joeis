package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019800 Decimal expansion of sqrt(2*e)/5.
 * @author Sean A. Irvine
 */
public class A019800 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019800() {
    super(CR.E.multiply(CR.TWO).sqrt().divide(CR.FIVE));
  }
}
