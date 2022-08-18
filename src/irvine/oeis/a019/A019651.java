package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019651 Decimal expansion of sqrt(Pi*e)/7.
 * @author Sean A. Irvine
 */
public class A019651 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019651() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.SEVEN));
  }
}
