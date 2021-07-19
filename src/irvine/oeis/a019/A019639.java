package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019639 Decimal expansion of sqrt(2*Pi*e)/13.
 * @author Sean A. Irvine
 */
public class A019639 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019639() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(13)));
  }
}
