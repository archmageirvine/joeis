package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019647 Decimal expansion of sqrt(Pi*e)/3.
 * @author Sean A. Irvine
 */
public class A019647 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019647() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.THREE));
  }
}
