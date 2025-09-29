package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388583 Decimal expansion of (16 * (2+sqrt(2)) * (-3+sqrt(3)) * exp((5 * Pi) / 6) * Gamma(11/12) * Gamma(5/4)^3 * sin(Pi / 8)^3) / (Pi^2 * Gamma(-1/3)).
 * @author Sean A. Irvine
 */
public class A388583 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388583() {
    super(1, CR.PI.multiply(new Q(5, 6)).exp().divide(96).divide(CR.SQRT_PI).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(5, 8)).pow(3)).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.TWO.add(CR.SQRT2)).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(7, 8)).pow(3)));
  }
}
