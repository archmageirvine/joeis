package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019665 Decimal expansion of sqrt(Pi*e)/21.
 * @author Sean A. Irvine
 */
public class A019665 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019665() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(21)));
  }
}
