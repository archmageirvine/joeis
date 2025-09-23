package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389071 Decimal expansion of (1/6) * 3^(5/12) * Gamma(2/3)^(1/3) * Gamma(3/4)^(7/3) * (sqrt(2) * (1+3^(1/2)))^(4/3) * (3^(1/2)-1) / Gamma(7/12) / Pi^(1/6) / Gamma(11/12)^(4/3).
 * @author Sean A. Irvine
 */
public class A389071 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389071() {
    super(1, CR.THREE.pow(new Q(5, 12)).divide(6).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(7, 3))).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(4, 3))).multiply(CR.THREE.sqrt().subtract(1)).divide(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CR.PI.pow(new Q(1, 6))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(4, 3))));
  }
}
