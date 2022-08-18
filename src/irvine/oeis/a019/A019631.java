package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019631 Decimal expansion of Pi*e/23.
 * @author Sean A. Irvine
 */
public class A019631 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019631() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(23)));
  }
}
