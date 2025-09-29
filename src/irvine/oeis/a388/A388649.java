package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388649 Decimal expansion of (2^(1/8) * (-3+sqrt(3)) * sqrt(Pi) * exp((5 * Pi) / 24) * Gamma(11/12)) / (Gamma(-1/3) * Gamma(3/4)).
 * @author Sean A. Irvine
 */
public class A388649 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388649() {
    super(0, CR.PI.multiply(new Q(5, 24)).exp().divide(3).multiply(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4))));
  }
}
