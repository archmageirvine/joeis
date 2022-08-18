package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019630 Decimal expansion of Pi*e/22.
 * @author Sean A. Irvine
 */
public class A019630 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019630() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(22)));
  }
}
