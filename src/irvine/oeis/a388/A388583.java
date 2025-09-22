package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388583 Decimal expansion of (1/96) * exp(5*Pi/6) * 2^(3/4) * 3^(1/2) * Gamma(5/8)^3 * Gamma(11/12) * (2+sqrt(2)) * (3^(1/2)-1) / Gamma(2/3) / Gamma(7/8)^3 / sqrt(Pi).
 * @author Sean A. Irvine
 */
public class A388583 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388583() {
    super(1, CR.PI.multiply(new Q(5, 6)).exp().divide(96).divide(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.TWO.add(CR.SQRT2)).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
