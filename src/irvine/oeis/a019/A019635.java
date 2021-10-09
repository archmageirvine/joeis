package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019635 Decimal expansion of sqrt(2*Pi*e)/5.
 * @author Sean A. Irvine
 */
public class A019635 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019635() {
    super(CR.TAU.multiply(CR.E).sqrt().divide(CR.FIVE));
  }
}
