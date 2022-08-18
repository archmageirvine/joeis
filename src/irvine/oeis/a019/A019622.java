package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019622 Decimal expansion of Pi*e/14.
 * @author Sean A. Irvine
 */
public class A019622 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019622() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(14)));
  }
}
