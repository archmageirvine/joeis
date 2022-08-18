package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019800 Decimal expansion of sqrt(2*e)/5.
 * @author Sean A. Irvine
 */
public class A019800 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019800() {
    super(0, CR.E.multiply(CR.TWO).sqrt().divide(CR.FIVE));
  }
}
