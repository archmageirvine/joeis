package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019627 Decimal expansion of Pi*e/19.
 * @author Sean A. Irvine
 */
public class A019627 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019627() {
    super(0, CR.PI.multiply(CR.E).divide(CR.valueOf(19)));
  }
}
