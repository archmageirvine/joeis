package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388801 Decimal expansion of 27/512 * Gamma(7/12)^9 * (5/3+3^(1/2)) * 3^(1/2) * exp(Pi/6) * 2^(5/8) * Gamma(11/12)^4 * Gamma(2/3)^5 / Pi^2 / Gamma(3/4)^15.
 * @author Sean A. Irvine
 */
public class A388801 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388801() {
    super(1, CrFunctions.GAMMA.cr(new Q(7, 12)).pow(9).multiply(new Q(27, 512)).multiply(CR.valueOf(new Q(5, 3)).add(CR.THREE.sqrt())).multiply(CR.THREE.sqrt()).multiply(CR.PI.divide(6).exp()).multiply(CR.TWO.pow(new Q(5, 8))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(4)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(5)).divide(CR.PI.square()).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(15)));
  }
}
