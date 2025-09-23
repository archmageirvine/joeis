package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389014 Decimal expansion of 2 * exp(Pi / 8) * 2^(23/24) * Gamma(11/12)^(3/2) * Gamma(7/12)^(3/2) / (sqrt(2) * (3^(1/2)-1))^(3/2) / (sqrt(2) * (1+3^(1/2)))^(4/3) / Gamma(3/4)^3.
 * @author Sean A. Irvine
 */
public class A389014 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389014() {
    super(1, CR.PI.divide(8).exp().multiply(CR.TWO.pow(new Q(47, 24))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(3, 2))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(new Q(3, 2))).divide(CR.SQRT2.multiply(CR.THREE.sqrt().subtract(1)).pow(new Q(3, 2))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(4, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(3)));
  }
}
