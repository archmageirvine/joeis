package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019660 Decimal expansion of sqrt(Pi*e)/16.
 * @author Sean A. Irvine
 */
public class A019660 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019660() {
    super(0, CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(16)));
  }
}
