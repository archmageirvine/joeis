package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388610 Decimal expansion of (3/4) * exp(-Pi) * 3^(1/2) * Gamma(2/3)^3 * Gamma(3/4)^5 * sqrt(2) * (1+3^(1/2))^3 / Gamma(11/12)^3 / Pi^2.
 * @author Sean A. Irvine
 */
public class A388610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388610() {
    super(0, CR.PI.negate().exp().multiply(new Q(3, 4)).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)).multiply(CR.SQRT2).multiply(CR.ONE.add(CR.THREE.sqrt()).pow(3)).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(3)).divide(CR.PI.square()));
  }
}
