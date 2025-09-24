package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388946 Decimal expansion of (1/36) * exp(Pi / 2) * Gamma(2/3)^2 * Gamma(3/4)^2 * (1+3^(1/2))^2 / Pi / Gamma(11/12)^2.
 * @author Sean A. Irvine
 */
public class A388946 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388946() {
    super(0, CR.HALF_PI.exp().divide(36).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CR.PI).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()));
  }
}
