package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388607 Decimal expansion of (2^(1/4) * (-3+sqrt(3)) * Pi^(5/4) * exp(Pi / 24)) / (Gamma(-1/3) * Gamma(7/12) * Gamma(3/4)^2).
 * @author Sean A. Irvine
 */
public class A388607 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388607() {
    super(0, CR.PI.divide(24).exp().divide(3).multiply(CR.PI.pow(new Q(5, 4))).multiply(CR.TWO.pow(Q.ONE_QUARTER)).multiply(CR.THREE.sqrt()).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).square()).divide(CrFunctions.GAMMA.cr(new Q(7, 12))));
  }
}
