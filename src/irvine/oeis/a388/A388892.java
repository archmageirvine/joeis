package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388892 Decimal expansion of -(1/6) * exp(2*Pi/3) * Pi^(3/2) * 2^(7/8) * Gamma(11/12)^2 * (-2+3^(1/2)) / Gamma(2/3)^2 / Gamma(3/4)^4.
 * @author Sean A. Irvine
 */
public class A388892 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388892() {
    super(0, CR.PI.multiply(new Q(2, 3)).exp().divide(-6).multiply(CR.PI.pow(new Q(3, 2))).multiply(CR.TWO.pow(new Q(7, 8))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).square()).multiply(CR.THREE.sqrt().subtract(2)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4)));
  }
}
