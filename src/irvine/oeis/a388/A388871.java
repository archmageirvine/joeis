package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388871 Decimal expansion of (1/8) * 3^(7/12) * sqrt(2) * Gamma(2/3)^(8/3) * Gamma(11/12)^(4/3) * Gamma(7/12)^4 * (7+4*3^(1/2)) / (sqrt(2) * (1+3^(1/2)))^(4/3) / Pi^(7/12) / Gamma(3/4)^(25/3).
 * @author Sean A. Irvine
 */
public class A388871 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388871() {
    super(0, CR.THREE.pow(new Q(7, 12)).divide(8).multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(8, 3))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(4, 3))).multiply(CrFunctions.GAMMA.cr(new Q(7, 12)).pow(4)).multiply(CR.SEVEN.add(CR.THREE.sqrt().multiply(4))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(4, 3))).divide(CR.PI.pow(new Q(7, 12))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(25, 3))));
  }
}
