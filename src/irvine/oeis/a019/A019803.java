package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019803 Decimal expansion of sqrt(2*e)/11.
 * @author Sean A. Irvine
 */
public class A019803 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019803() {
    super(CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(11)));
  }
}
