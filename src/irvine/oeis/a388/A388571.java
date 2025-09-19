package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388571 Decimal expansion of -(1/12) * exp(Pi) * Pi^2 * Gamma(11/12)^2 * (-2+3^(1/2)) / Gamma(2/3)^2 / Gamma(3/4)^6.
 * @author Sean A. Irvine
 */
public class A388571 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388571() {
    super(0, CR.PI.exp().divide(-12).multiply(CR.PI.square()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.THREE.sqrt().subtract(2)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(6)));
  }
}
