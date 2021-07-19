package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019614 Decimal expansion of Pi*e/6.
 * @author Sean A. Irvine
 */
public class A019614 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019614() {
    super(CR.PI.multiply(CR.E).divide(CR.SIX));
  }
}
