package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019646 Decimal expansion of sqrt(Pi*e)/2.
 * @author Sean A. Irvine
 */
public class A019646 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019646() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.TWO));
  }
}
