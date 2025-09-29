package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388624 Decimal expansion of (-6 * (3+sqrt(3)) * exp(-Pi/4) * Gamma(2/3) * Gamma(3/4)) / (sqrt(Pi) * Gamma(-1/12)).
 * @author Sean A. Irvine
 */
public class A388624 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388624() {
    super(0, CR.PI.divide(-4).exp().divide(2).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4))).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CR.SQRT_PI));
  }
}
