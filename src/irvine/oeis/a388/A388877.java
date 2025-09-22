package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388877 Decimal expansion of (1/128) * exp(Pi / 2) * 2^(1/3) * 3^(2/3) * (1+3^(1/2))^5 * Gamma(2/3)^(4/3) * Gamma(11/12)^(11/3) * Gamma(7/12)^5 * (11*3^(1/2)-19) / Gamma(3/4)^(26/3) / Pi^(2/3).
 * @author Sean A. Irvine
 */
public class A388877 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388877() {
    super(0, CR.HALF_PI.exp().divide(128).multiply(CR.TWO.pow(Q.ONE_THIRD)).multiply(CR.THREE.pow(new Q(2, 3))).multiply(CR.ONE.add(CR.THREE.sqrt()).pow(5)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(4, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(11, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(5)).multiply(CR.THREE.sqrt().multiply(11).subtract(19)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(26, 3))).divide(CR.PI.pow(new Q(2, 3))));
  }
}
