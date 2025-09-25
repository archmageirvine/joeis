package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388907 Decimal expansion of ((3+sqrt(3)) * exp((-3 * Pi) / 8) * Gamma(2/3) * Gamma(3/4)) / (sqrt(2 * Pi) * Gamma(11/12)).
 * @author Sean A. Irvine
 */
public class A388907 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388907() {
    super(0, CR.PI.multiply(new Q(-3, 8)).exp().divide(2).divide(CR.SQRT_PI).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).multiply(CR.SQRT2).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(11, 12))));
  }
}
