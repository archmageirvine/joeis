package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388900 Decimal expansion of -(1/3) * exp(5*Pi/8) * Pi^(5/4) * 2^(1/4) * Gamma(11/12)^2 * (-2+3^(1/2)) / Gamma(2/3)^2 / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388900 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388900() {
    super(1, CR.PI.multiply(new Q(5, 8)).exp().divide(-3).multiply(CR.PI.pow(new Q(5, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.THREE.sqrt().subtract(2)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
