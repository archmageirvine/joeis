package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019658 Decimal expansion of sqrt(Pi*e)/14.
 * @author Sean A. Irvine
 */
public class A019658 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019658() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(14)));
  }
}
