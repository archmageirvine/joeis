package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388623 Decimal expansion of -(1/8) * exp(Pi) * sqrt(2) * (-3+2 * sqrt(2)).
 * @author Sean A. Irvine
 */
public class A388623 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388623() {
    super(0, CR.PI.exp().divide(-8).multiply(CR.SQRT2).multiply(CR.SQRT2.multiply(2).subtract(3)));
  }
}
