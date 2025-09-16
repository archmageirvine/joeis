package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388163 Decimal expansion of 16 * exp(-1/2 * Pi) * sqrt(2) * Gamma(3/4)^12 / Pi^3.
 * @author Sean A. Irvine
 */
public class A388163 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388163() {
    super(1, CR.HALF_PI.negate().exp().multiply(16).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)).divide(CR.PI.pow(3)));
  }
}
