package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388092 Decimal expansion of 1/32 * exp(1/2 * Pi) * Pi^3*2^(1/2) / Gamma(3/4)^12.
 * @author Sean A. Irvine
 */
public class A388092 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388092() {
    super(0, CR.HALF_PI.exp().divide(32).multiply(CR.PI.pow(3)).multiply(CR.SQRT2).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(12)));
  }
}
