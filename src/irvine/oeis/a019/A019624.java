package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019624 Decimal expansion of Pi*e/16.
 * @author Sean A. Irvine
 */
public class A019624 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019624() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(16)));
  }
}
