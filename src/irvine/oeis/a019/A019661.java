package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019661 Decimal expansion of sqrt(Pi*e)/17.
 * @author Sean A. Irvine
 */
public class A019661 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019661() {
    super(CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(17)));
  }
}
