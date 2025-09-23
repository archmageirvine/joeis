package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389051 Decimal expansion of (1/320) * 2^(1/10) * 5^(1/4) * Gamma(2/3) * Gamma(7/12) * Gamma(3/5)^2 * Gamma(7/10) * (1+3^(1/2)) * (5+5^(1/2)) * (5^(1/2)+1)^2 / sqrt(Pi) / Gamma(3/4)^5 / Gamma(9/10).
 * @author Sean A. Irvine
 */
public class A389051 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389051() {
    super(1, CR.TWO.pow(new Q(1, 10)).divide(320).multiply(CR.FIVE.pow(Q.ONE_QUARTER)).multiply(CrFunctions.GAMMA.cr(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12))).multiply(CrFunctions.GAMMA.cr(new Q(3, 5)).square()).multiply(CrFunctions.GAMMA.cr(new Q(7, 10))).multiply(CR.ONE.add(CR.THREE.sqrt())).multiply(CR.FIVE.add(CR.FIVE.sqrt())).multiply(CR.FIVE.sqrt().add(1).square()).divide(CR.SQRT_PI).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(5)).divide(CrFunctions.GAMMA.cr(new Q(9, 10))));
  }
}
