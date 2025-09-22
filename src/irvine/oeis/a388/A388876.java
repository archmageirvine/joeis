package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388876 Decimal expansion of (1/6) * exp(3*Pi/8) * Pi * 2^(1/8) * 3^(1/2) * Gamma(11/12) * (3^(1/2)-1) / Gamma(2/3) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A388876 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388876() {
    super(0, CR.PI.multiply(new Q(3, 8)).exp().divide(6).multiply(CR.PI).multiply(CR.TWO.pow(new Q(1, 8))).multiply(CR.THREE.sqrt()).multiply(CrFunctions.GAMMA.cr(new Q(11, 12))).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
