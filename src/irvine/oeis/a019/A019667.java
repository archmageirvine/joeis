package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019667 Decimal expansion of sqrt(Pi*e)/23.
 * @author Sean A. Irvine
 */
public class A019667 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019667() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(23)));
  }
}
