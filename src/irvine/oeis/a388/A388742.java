package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388742 Decimal expansion of (1/3) * exp(Pi / 8) * Pi^(13/12) * 2^(3/4) * 3^(5/12) * Gamma(11/12)^(2/3) / Gamma(2/3)^(2/3) / Gamma(3/4)^(11/3) / (sqrt(2) * (1+3^(1/2)))^(2/3).
 * @author Sean A. Irvine
 */
public class A388742 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388742() {
    super(0, CR.PI.divide(8).exp().divide(3).multiply(CR.PI.pow(new Q(13, 12))).multiply(CR.TWO.pow(new Q(3, 4))).multiply(CR.THREE.pow(new Q(5, 12))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(11, 3))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(2, 3))));
  }
}
