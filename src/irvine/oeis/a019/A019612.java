package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019612 Decimal expansion of Pi*e/4.
 * @author Sean A. Irvine
 */
public class A019612 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019612() {
    super(CR.PI.multiply(CR.E).divide(CR.FOUR));
  }
}
