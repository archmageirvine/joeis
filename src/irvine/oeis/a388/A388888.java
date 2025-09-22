package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388888 Decimal expansion of (1/4) * 3^(2/3) * Gamma(2/3)^(4/3) * Gamma(11/12)^(2/3) * Gamma(7/12)^2 * (2+3^(1/2)) / (sqrt(2) * (1+3^(1/2)))^(2/3) / Pi^(1/6) / Gamma(3/4)^(14/3).
 * @author Sean A. Irvine
 */
public class A388888 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388888() {
    super(0, CR.THREE.pow(new Q(2, 3)).divide(4).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(4, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).square()).multiply(CR.TWO.add(CR.THREE.sqrt())).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(2, 3))).divide(CR.PI.pow(new Q(1, 6))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(14, 3))));
  }
}
