package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389028 Decimal expansion of (1/4) * 3^(1/3) * Gamma(2/3)^(2/3) * Gamma(11/12)^(1/3) * Gamma(7/12) / (sqrt(2) * (1+3^(1/2)))^(1/3) * sqrt(2) * (1+3^(1/2)) / Pi^(1/3) / Gamma(3/4)^(4/3).
 * @author Sean A. Irvine
 */
public class A389028 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389028() {
    super(0, CR.THREE.pow(Q.ONE_THIRD).divide(4).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(Q.ONE_THIRD)).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(Q.ONE_THIRD)).multiply(CR.SQRT2).multiply(CR.ONE.add(CR.THREE.sqrt())).divide(CR.PI.pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(4, 3))));
  }
}
