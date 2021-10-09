package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019649 Decimal expansion of sqrt(Pi*e)/5.
 * @author Sean A. Irvine
 */
public class A019649 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019649() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.FIVE));
  }
}
