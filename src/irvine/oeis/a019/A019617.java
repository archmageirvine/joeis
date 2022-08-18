package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019617 Decimal expansion of Pi*e/9.
 * @author Sean A. Irvine
 */
public class A019617 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019617() {
    super(0, CR.PI.multiply(CR.E).divide(CR.NINE));
  }
}
