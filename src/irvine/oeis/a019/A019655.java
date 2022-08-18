package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019655 Decimal expansion of sqrt(Pi*e)/11.
 * @author Sean A. Irvine
 */
public class A019655 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019655() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(11)));
  }
}
