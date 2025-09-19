package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388616 Decimal expansion of (1/72) * exp(2*Pi/3) * Gamma(2/3)^2 * (1+3^(1/2))^2 / Gamma(11/12)^2 / Gamma(3/4)^2.
 * @author Sean A. Irvine
 */
public class A388616 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388616() {
    super(0, CR.PI.multiply(new Q(2, 3)).exp().divide(72).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).multiply(CR.ONE.add(CR.THREE.sqrt()).square()).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()));
  }
}
