package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388450 Decimal expansion of (3/4) * exp(-Pi / 2) * Gamma(2/3)^2 * Gamma(3/4)^2 * (1+3^(1/2))^2 / Gamma(11/12)^2 / Pi.
 * @author Sean A. Irvine
 */
public class A388450 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388450() {
    super(0, CR.HALF_PI.negate().exp().multiply(new Q(3, 4)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CR.PI));
  }
}
