package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388701 Decimal expansion of 12 * (2 + sqrt(3)) *exp(-Pi) * Gamma(2/3)^2 * Gamma(3/4)^8 / Gamma(11/12)^5 / Gamma(7/12)^3 / Pi.
 * @author Sean A. Irvine
 */
public class A388701 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388701() {
    super(1, CR.PI.negate().exp().multiply(-12).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(8)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(5)).divide(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(3)).divide(CR.THREE.sqrt().subtract(2)).divide(CR.PI));
  }
}
