package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388492 Decimal expansion of (2/3) * exp(Pi / 12) * Pi^(1/3) * 3^(11/12) * Gamma(11/12)^(2/3) / Gamma(2/3)^(2/3) / Gamma(3/4)^(2/3) / (sqrt(2) * (1+sqrt(3)))^(2/3).
 * @author Sean A. Irvine
 */
public class A388492 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388492() {
    super(1, CR.PI.divide(12).exp().multiply(new Q(2, 3)).multiply(CR.PI.pow(new Q(1, 3))).multiply(CR.THREE.pow(new Q(11, 12))).multiply(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(2, 3))).divide(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(2, 3))));
  }
}
