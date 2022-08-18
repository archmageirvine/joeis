package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019807 Decimal expansion of sqrt(2*e)/19.
 * @author Sean A. Irvine
 */
public class A019807 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019807() {
    super(0, CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(19)));
  }
}
