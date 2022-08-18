package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019656 Decimal expansion of sqrt(Pi*e)/12.
 * @author Sean A. Irvine
 */
public class A019656 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019656() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(12)));
  }
}
