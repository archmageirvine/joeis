package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388775 Decimal expansion of (1/3) * exp(5*Pi/24) * 2^(3/8) * 3^(7/12) * Pi^(1/6) * Gamma(11/12)^(1/3) / (sqrt(2) * (1+3^(1/2)))^(1/3) / Gamma(2/3)^(1/3) / Gamma(3/4)^(1/3).
 * @author Sean A. Irvine
 */
public class A388775 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388775() {
    super(1, CR.PI.multiply(new Q(5, 24)).exp().divide(3).multiply(CR.TWO.pow(new Q(3, 8))).multiply(CR.THREE.pow(new Q(7, 12))).multiply(CR.PI.pow(new Q(1, 6))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(Q.ONE_THIRD)).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(Q.ONE_THIRD)).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(Q.ONE_THIRD)));
  }
}
