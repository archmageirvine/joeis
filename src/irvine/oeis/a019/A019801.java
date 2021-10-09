package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019801 Decimal expansion of sqrt(2*e)/7.
 * @author Sean A. Irvine
 */
public class A019801 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019801() {
    super(CR.E.multiply(CR.TWO).sqrt().divide(CR.SEVEN));
  }
}
