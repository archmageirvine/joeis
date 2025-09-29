package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388523 Decimal expansion of (3^(1/12) * exp(-Pi/6) * (((1+sqrt(3)) * Gamma(2/3) * Gamma(3/4)) / Gamma(11/12))^(2/3)) / (2^(1/6) * Pi^(1/3)).
 * @author Sean A. Irvine
 */
public class A388523 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388523() {
    super(1, CR.PI.divide(-6).exp().divide(2).multiply(CR.SQRT2).multiply(CR.THREE.pow(new Q(1, 12))).multiply(CrFunctions.GAMMA.cr(new Q(2, 3)).pow(new Q(2, 3))).multiply(CrFunctions.GAMMA.cr(new Q(3, 4)).pow(new Q(2, 3))).multiply(CR.SQRT2.multiply(CR.ONE.add(CR.THREE.sqrt())).pow(new Q(2, 3))).divide(CrFunctions.GAMMA.cr(new Q(11, 12)).pow(new Q(2, 3))).divide(CR.PI.pow(new Q(1, 3))));
  }
}
