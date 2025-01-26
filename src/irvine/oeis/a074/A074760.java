package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A074760 Decimal expansion of lambda(1) in Li's criterion.
 * @author Sean A. Irvine
 */
public class A074760 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A074760() {
    super(0, CR.GAMMA.divide(2).add(1).subtract(CR.PI.multiply(4).log().divide(2)));
  }
}
