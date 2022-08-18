package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019639 Decimal expansion of sqrt(2*Pi*e)/13.
 * @author Sean A. Irvine
 */
public class A019639 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019639() {
    super(0, CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(13)));
  }
}
