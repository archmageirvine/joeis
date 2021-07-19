package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019805 Decimal expansion of sqrt(2*e)/15.
 * @author Sean A. Irvine
 */
public class A019805 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019805() {
    super(CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(15)));
  }
}
