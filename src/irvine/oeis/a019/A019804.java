package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019804 Decimal expansion of sqrt(2*e)/13.
 * @author Sean A. Irvine
 */
public class A019804 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019804() {
    super(CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(13)));
  }
}
