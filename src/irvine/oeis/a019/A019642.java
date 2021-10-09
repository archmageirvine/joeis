package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019642 Decimal expansion of sqrt(2*Pi*e)/19.
 * @author Sean A. Irvine
 */
public class A019642 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019642() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(19)));
  }
}
