package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019643 Decimal expansion of sqrt(2*Pi*e)/21.
 * @author Sean A. Irvine
 */
public class A019643 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019643() {
    super(0, CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(21)));
  }
}
