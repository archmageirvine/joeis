package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019809 Decimal expansion of sqrt(2*e)/23.
 * @author Sean A. Irvine
 */
public class A019809 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019809() {
    super(0, CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(23)));
  }
}
