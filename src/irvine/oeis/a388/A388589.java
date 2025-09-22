package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388589 Decimal expansion of (1/12) * exp(Pi / 2) * Pi * 3^(1/2) * Gamma(11/12) * sqrt(2) * (3^(1/2)-1) / Gamma(3/4)^3 / Gamma(2/3).
 * @author Sean A. Irvine
 */
public class A388589 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388589() {
    super(0, CR.HALF_PI.exp().divide(12).multiply(CR.PI).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CR.SQRT2).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
