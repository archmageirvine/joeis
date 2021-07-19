package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019648 Decimal expansion of sqrt(Pi*e)/4.
 * @author Sean A. Irvine
 */
public class A019648 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019648() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.FOUR));
  }
}
